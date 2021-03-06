package com.maximusteam.tripfulaxel.livechat.model.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.maximusteam.tripfulaxel.livechat.model.dto.ChatJoinUserDTO;
import com.maximusteam.tripfulaxel.livechat.model.dto.ChatMessageDTO;
import com.maximusteam.tripfulaxel.livechat.model.dto.ChatRoomDTO;

public interface ChatService {

	public List<ChatRoomDTO> selectChatRoom(Map<String, Integer> parameter);
	
	public int insertMessage(ChatMessageDTO message);
	
	public int insertRoom(ChatRoomDTO room);
	
	public int insertChatJoin(ChatJoinUserDTO user);

	public int deleteJoinUser(ChatJoinUserDTO user);

	public List<ChatJoinUserDTO> selectJoinList(Map<String, Integer> parameter);

}
