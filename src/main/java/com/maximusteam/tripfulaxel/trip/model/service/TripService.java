package com.maximusteam.tripfulaxel.trip.model.service;

import java.util.List;
import java.util.Map;

import com.maximusteam.tripfulaxel.trip.model.dto.GuideDTO;
import com.maximusteam.tripfulaxel.trip.model.dto.ReviewDTO;
import com.maximusteam.tripfulaxel.trip.model.dto.SortCondition;
import com.maximusteam.tripfulaxel.trip.model.dto.TripDTO;
import com.maximusteam.tripfulaxel.trip.model.dto.TripInquiryDTO;
import com.maximusteam.tripfulaxel.trip.model.dto.TripPaymentDTO;

public interface TripService {
	
	List<TripDTO> selectTripList(Map<String, Object> parameter);

	List<ReviewDTO> selectReviewList(int tripCode);
	
	GuideDTO selectGuide(int tripCode);
	
	public int insertTripInquiry(TripInquiryDTO inquiry);

	int insertTripJoin(TripPaymentDTO pay);

	int insertPayment(TripPaymentDTO pay);
}
