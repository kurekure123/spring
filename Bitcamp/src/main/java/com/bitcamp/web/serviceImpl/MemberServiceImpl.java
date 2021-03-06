package com.bitcamp.web.serviceImpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.MemberDTO;
import com.bitcamp.web.mapper.MemberMapper;
import com.bitcamp.web.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService{
	private static final Logger logger = LoggerFactory.getLogger(MemberServiceImpl.class);
	@Autowired MemberDTO member;
	@Autowired MemberMapper mapper;
	@Override
	public void addMember(Command cmd) {
		logger.info("MemberServiceImpl() SETTING ID is {}", cmd.getMember().getId());
		mapper.insertMember(cmd);
	}

	@Override
	public MemberDTO findById(Command cmd) {
		// TODO Auto-generated method stub
		return mapper.selectById(cmd);
	}

	@Override
	public boolean exist(Command cmd) {
	    logger.info("MemberServiceImpl() ID is {}", cmd.getMember().getId());
	    boolean flag = false;
	    flag = (mapper.count(cmd) != 0) ? true : false;
	   /* if(mapper.exist(cmd) != 0) {
	    	flag = true;
	    }*/
		return flag;
	}

	@Override
	public void removeMember(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ModifyMember(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<MemberDTO> list(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MemberDTO> findByMember(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

}
