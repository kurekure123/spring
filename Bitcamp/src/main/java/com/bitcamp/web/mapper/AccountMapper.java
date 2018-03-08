package com.bitcamp.web.mapper;

import java.util.List;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.AccountDTO;

public interface AccountMapper {
	public void insertAccount (Command cmd);
	public void updateAccount(Command cmd);
	public void delectAccount(Command cmd);
	public List<AccountDTO> list(Command cmd);
	public List<AccountDTO> selectByAccount(Command cmd); // not pk
	public AccountDTO selectById(Command cmd); // pk
	public int count();
}
