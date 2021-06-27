package com.maximusteam.tripfulaxel.admin.model.service;

import java.util.List;

import com.maximusteam.tripfulaxel.admin.model.dto.AdminDTO;
import com.maximusteam.tripfulaxel.admin.model.dto.MemberDTO;
import com.maximusteam.tripfulaxel.admin.model.dto.ReportDTO;

public interface AdminService {

	List<AdminDTO> selectAdminList();

	List<MemberDTO> selectMemberList();

	List<ReportDTO> selectReportList();
}
