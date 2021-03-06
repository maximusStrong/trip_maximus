package com.maximusteam.tripfulaxel.guide.model.dao;

import com.maximusteam.tripfulaxel.admin.model.dto.ExamineDTO;
import com.maximusteam.tripfulaxel.guide.model.dto.GuideDTO;
import com.maximusteam.tripfulaxel.guide.model.dto.GuideStyleChoiceDTO;
import com.maximusteam.tripfulaxel.guide.model.dto.GuideTripDTO;
import com.maximusteam.tripfulaxel.guide.model.dto.TripCourseDTO;
import com.maximusteam.tripfulaxel.guide.model.dto.TripDTO;
import com.maximusteam.tripfulaxel.guide.model.dto.TripImageDTO;
import com.maximusteam.tripfulaxel.guide.model.dto.TripRegistListDTO;
import com.maximusteam.tripfulaxel.guide.model.dto.TripThemeChoiceDTO;
import com.maximusteam.tripfulaxel.guide.model.dto.TripTransitChoiceDTO;
import com.maximusteam.tripfulaxel.guide.model.dto.UserTripAloneDTO;
import com.maximusteam.tripfulaxel.guide.model.dto.UserTripTogetherDTO;

public interface InsertTripMapper {

	int insertGuideImage(TripImageDTO tripImageDTO); 
	int insertTripImage(TripImageDTO tripImageDTO);
	int insertGuide(GuideDTO guideDTO);
	int insertGuideStyleChoice(GuideStyleChoiceDTO guideStyleChoiceDTO); 
	int insertTrip(TripDTO tripDTO);
	int insertTripRegistList(TripRegistListDTO tripRegistListDTO);
	int insertExamine(ExamineDTO examineDTO);
	int insertGuideTrip(GuideTripDTO guideTripDTO);
	int insertTheme(TripThemeChoiceDTO tripThemeChoiceDTO);
	int insertTransit(TripTransitChoiceDTO tripTransitChoiceDTO);
	int insertTripCourse(TripCourseDTO tripCourseDTO);
	int updateTripImage(TripImageDTO tripImageDTO);
	
	int insertTripAlone(UserTripAloneDTO userTripAloneDTO);
	
	int insertTripTogether(UserTripTogetherDTO userTripTogetherDTO);
	
	
}
