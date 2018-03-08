package com.bitcamp.web.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bitcamp.web.domain.MobileDTO;
import com.bitcamp.web.factory.ShiftFactory;
import com.bitcamp.web.service.MobileService;

@Controller
public class MobileController {
	private static final Logger logger = LoggerFactory.getLogger(MobileController.class);
	@Autowired ShiftFactory shift;
	@Autowired MobileDTO phone; 
	@Autowired MobileService mService;
	
	@RequestMapping("/mobile/open")
	public String phone(Model model){
		List<MobileDTO> phones = mService.list();
		model.addAttribute("phones", phones);
		logger.info("PhoneController phonenav() : {} ", "ENTERED");
		return shift.create("mobile", "main");
	}
	
}
