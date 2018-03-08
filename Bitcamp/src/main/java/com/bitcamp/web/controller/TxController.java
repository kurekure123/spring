package com.bitcamp.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.MemberDTO;
import com.bitcamp.web.domain.MobileDTO;
import com.bitcamp.web.domain.TxDTO;
import com.bitcamp.web.factory.ShiftFactory;
import com.bitcamp.web.service.TxService;

@SessionAttributes("user")
@Controller
public class TxController {
	private static final Logger logger = LoggerFactory.getLogger(TxController.class);
	@Autowired ShiftFactory shift;
	@Autowired MobileDTO phone; 
	@Autowired Command cmd;
	@Autowired TxDTO tx;
	@Autowired TxService tService;
	
	 @RequestMapping(value="/mobile/open", method=RequestMethod.POST)
	  public String openPhone(Model model,
	      @RequestParam("seq") String seq,
	      @RequestParam("telecom") String telecom,
	      @ModelAttribute("user") MemberDTO member) {
	    logger.info("phoneSeq {}", seq);
	    logger.info("telecom {}", telecom);
	    String id = member.getId();
	    String phoneid = id + seq;
	    tx.setTxkey(phoneid);
	    tx.setId(id);
	    tx.setPhoneNum(tService.createPhoneNum(cmd));
	    tx.setTelecom(telecom);
	    cmd.setTx(tx);
	    tService.addTx(cmd);
	    logger.info("phoneSeq {}", id + seq);
	    return shift.create("user", "mypage");
	 }
}
