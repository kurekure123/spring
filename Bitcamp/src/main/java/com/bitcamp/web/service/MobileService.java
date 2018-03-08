package com.bitcamp.web.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.command.ResultMap;
import com.bitcamp.web.domain.MemberDTO;
import com.bitcamp.web.domain.MobileDTO;

@Component
public interface MobileService {
	public void  addMobile(Command cmd);
	public void ModifyMobile(Command cmd);
	public void removeMobile(Command cmd);
	public List<MobileDTO> list();
	public List<MobileDTO> findByMobile(Command cmd); // not pk
	public MobileDTO findById(Command cmd); // pk
	public int count();
}
