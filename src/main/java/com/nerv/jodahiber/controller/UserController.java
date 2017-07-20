package com.nerv.jodahiber.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.nerv.jodahiber.service.impl.UserService;
import com.nerv.jodahiber.vo.UserAndProvVo;


@Controller
public class UserController {

	@Autowired
	@Qualifier("userService")
	private UserService userServcie;
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String index(){
		return "index";
	}
	
	@RequestMapping(value="/showTableOne", method = RequestMethod.GET)
	@ResponseBody
	public String showTableOne(){
		List<Object[]> list = userServcie.showTableOne();
		return JSON.toJSONString(list);
	}
	
	@RequestMapping(value="/showTableTwo", method = RequestMethod.GET)
	@ResponseBody
	public String showTableTwo(){
		List<UserAndProvVo> list = userServcie.showTableTwo();
		return JSON.toJSONString(list);
	}
}
