package com.maximusteam.tripfulaxel.livechat.controller;

import java.io.File;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.maximusteam.tripfulaxel.livechat.model.dto.ChatJoinUserDTO;
import com.maximusteam.tripfulaxel.livechat.model.dto.ChatMessageDTO;
import com.maximusteam.tripfulaxel.livechat.model.dto.ChatRoomDTO;
import com.maximusteam.tripfulaxel.livechat.model.service.ChatService;
import com.maximusteam.tripfulaxel.livechat.model.service.ChatServiceImpl;

@Controller
public class ChatController {

	private ChatService chatService;
	SimpMessagingTemplate template;
	
	@Autowired
	public ChatController(ChatService chatService, SimpMessagingTemplate template) {
		this.chatService = chatService;
		this.template = template;
	}
	
	@MessageMapping("/message")
	public void chat(ChatMessageDTO message) {
		int messageResult = 0;
		int joinResult = 0;
		int deleteJoinResult = 0;
		System.out.println("message insert field test : " + message.getMessageImage());
		
		if(message.getMessageType().equals("join")) {
			
			ChatJoinUserDTO user = new ChatJoinUserDTO();
			
			user.setRoomCode(message.getRoomCode());
			user.setUserCode(message.getUserCode());
			
			joinResult = chatService.insertChatJoin(user);
			
//			user chatroom ????????? ?????? ????????? ??????
			if(joinResult > 0) {
				
				String joinMessage = message.getUserEmail() + " ?????? ?????? ???????????????.";
				message.setMessageContent(joinMessage);
				
				this.template.convertAndSend("/topic/group/" + message.getRoomCode(), message);
			} else {
				System.out.println("?????? ?????? ?????? ??????!!!");
			}
			
		} else if(message.getMessageType().equals("out")){
			
			String outMessage = message.getUserEmail() + " ?????? ?????? ???????????????.";
			message.setMessageContent(outMessage);
			
			ChatJoinUserDTO user = new ChatJoinUserDTO();
			
			user.setRoomCode(message.getRoomCode());
			user.setUserCode(message.getUserCode());
			
			deleteJoinResult = chatService.deleteJoinUser(user);
			
			if(deleteJoinResult > 0) {
				this.template.convertAndSend("/topic/group/" + message.getRoomCode(), message);
				
			} else {
				System.out.println("????????? ????????? ?????? ???????????????.");
			}
			
		} else {
			messageResult = chatService.insertMessage(message);
			
		}
		if(messageResult > 0) {
			this.template.convertAndSend("/topic/group/" + message.getRoomCode(), message);
		}
	}
	
	@PostMapping("share/insert/imgMessage")
	public void insertImgMessage(Model model, 
			@RequestParam(name="imgMessage", required=false) MultipartFile imgMessage, 
			HttpServletResponse response, HttpServletRequest request) {
		
		/*
		 * multipart??? ????????? request??? ?????? ????????? ????????? ???????????? ????????? ?????? ????????? ???????????? ???????????? ?????????.
		 * ??????????????? ????????? ????????? ????????????. --> web.xml??? ????????? ??????
		 */
		System.out.println("imgMessage : " + imgMessage);
		
		/*
		 * ????????? ????????? ?????? ??? 
		 */
		String root = request.getSession().getServletContext().getRealPath("resources");
		System.out.println("root : " + root);
		
		String filePath = root + "/images/message";
		
		// ?????? ???????????? ????????? ?????? ??????
		File mkdir = new File(filePath);
		if(!mkdir.exists()) {
			mkdir.mkdir();
		}
		
		// ????????? ?????? ??????
		String orignFileName = imgMessage.getOriginalFilename();
		String ext = orignFileName.substring(orignFileName.lastIndexOf("."));
		String saveName = UUID.randomUUID().toString().replace("-", "") + ext;
		
		// ????????? ????????????.
		
		try {
			imgMessage.transferTo(new File(filePath + "/" + saveName));
			
			model.addAttribute("message", "?????? ????????? ??????!!");
			
			response.getWriter().print(saveName);
			
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
			
//			????????? ?????? ??????
			new File(filePath + "/" + saveName).delete();
		}
		
	}
	
	@RequestMapping("/share/insert/chatRoom")
	public String insertChatRoom(Model model, @RequestParam String roomTitle, int userCode, String userEmail) {
		
		ChatJoinUserDTO user = new ChatJoinUserDTO();
		user.setUserCode(userCode);
		user.setUserEmail(userEmail);
		
		List<ChatJoinUserDTO> joinUser = new ArrayList<ChatJoinUserDTO>();
		joinUser.add(user);
		
		ChatRoomDTO room = new ChatRoomDTO();
		room.setRoomTitle(roomTitle);
		room.setJoinUserList(joinUser);
		
		int insertRoomResult = chatService.insertRoom(room);
		
		user.setRoomCode(room.getRoomCode());
		
		if(insertRoomResult > 0) {
			model.addAttribute("room", room);
			return "user/livechat/chat";
		} else {
			return "fail";
		}
		
	}
	
	@RequestMapping("/share/select/chatRoom")
	public String selectChatRoomList(Model model, @RequestParam int roomCode, @RequestParam(required = false) int userCode) {
		
		Map<String, Integer> parameter = new HashedMap();
		parameter.put("roomCode", roomCode);
		parameter.put("userCode", userCode);
		
		List<ChatRoomDTO> roomList = chatService.selectChatRoom(parameter);
		
		if(roomCode != 0 && userCode != 0) {
			
			ChatRoomDTO room = roomList.get(0);
			
			List<ChatJoinUserDTO> joinList = chatService.selectJoinList(parameter);
			
			room.setJoinUserList(joinList);
			
			model.addAttribute("room", room);
			
			return "user/livechat/chat";
			
		} else {
			model.addAttribute("roomList", roomList);
			
			return "user/livechat/chatList";
		}
	}
	
}
