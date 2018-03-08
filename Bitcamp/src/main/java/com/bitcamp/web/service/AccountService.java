package com.bitcamp.web.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.command.ResultMap;
import com.bitcamp.web.domain.AccountDTO;

@Component
public interface AccountService {

	public void addAccount (Command cmd);
	public void modifyAccount(Command cmd);
	public void removeAccount(Command cmd);
	public List<AccountDTO> list(Command cmd);
	public List<AccountDTO> findByAccount(Command cmd); // not pk
	public AccountDTO findById(Command cmd); // pk
	public int count();
}
