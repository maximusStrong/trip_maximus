package com.maximusteam.tripfulaxel.trip.model.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maximusteam.tripfulaxel.trip.model.dao.TripMapper;
import com.maximusteam.tripfulaxel.trip.model.dto.GuideDTO;
import com.maximusteam.tripfulaxel.trip.model.dto.ReviewDTO;
import com.maximusteam.tripfulaxel.trip.model.dto.SortCondition;
import com.maximusteam.tripfulaxel.trip.model.dto.TripDTO;
import com.maximusteam.tripfulaxel.trip.model.dto.TripInquiryDTO;
import com.maximusteam.tripfulaxel.trip.model.dto.TripPaymentAndJoinDTO;

@Service
public class TripServiceImpl implements TripService{

	private final TripMapper tripMapper;
	
	@Autowired
	public TripServiceImpl(TripMapper tripMapper) {
		this.tripMapper = tripMapper;
	}

	@Override
	public List<TripDTO> selectTripList(Map<String, Object> parameter) {
		
		return tripMapper.selectTripList(parameter);
	}

	@Override
	public List<ReviewDTO> selectReviewList(int tripCode) {
		
		return tripMapper.selectReviewList(tripCode);
	}

	@Override
	public GuideDTO selectGuide(int tripCode) {
		
		return tripMapper.selectGuide(tripCode);
	}

	@Override
	public int insertTripInquiry(TripInquiryDTO inquiry) {
		return tripMapper.insertTripInquiry(inquiry);
	}
	
	@Override
	public int insertTripJoin(TripPaymentAndJoinDTO pay) {
		return tripMapper.insertTripJoin(pay);
	}

	@Override
	public int insertPayment(TripPaymentAndJoinDTO pay) {
		return tripMapper.insertPayment(pay);
	}


}
