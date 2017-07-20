package com.nerv.jodahiber.service.impl;

import java.util.List;

import com.nerv.jodahiber.vo.UserAndProvVo;

public interface UserService {
	
	List<Object[]> showTableOne();
	
	List<UserAndProvVo> showTableTwo();
	
}
