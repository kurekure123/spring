package com.bitcamp.web.service;


import java.util.List;

import org.springframework.stereotype.Component;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.LottoDTO;
import com.bitcamp.web.domain.MemberDTO;

@Component
public interface MemberService {
	public void  addMember(Command cmd);
	public void ModifyMember(Command cmd);
	public void removeMember(Command cmd);
	public List<MemberDTO> list(Command cmd);
	public List<MemberDTO> findByMember(Command cmd); // not pk
	public MemberDTO  findById(Command cmd); // pk
	public int count();
	public boolean  exist(Command cmd);

}
