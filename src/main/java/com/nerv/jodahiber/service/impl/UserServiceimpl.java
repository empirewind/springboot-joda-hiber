package com.nerv.jodahiber.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nerv.jodahiber.dao.UserDao;
import com.nerv.jodahiber.vo.UserAndProvVo;

@Service("userService")
public class UserServiceimpl implements UserService{

	@Autowired
	private UserDao userDao;
	@Override
	public List<Object[]> showTableOne() {
		List<Object[]> list = userDao.findUserAndProv();
		System.out.println(list.size());
		return list;
		
	}
	
	@Override
	public List<UserAndProvVo> showTableTwo() {
		List<UserAndProvVo> provVos = userDao.findUserAndProv_();
		System.out.println(provVos.size());
		return provVos;
	}

	
}
