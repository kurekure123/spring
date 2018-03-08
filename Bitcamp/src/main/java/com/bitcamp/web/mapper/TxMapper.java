package com.bitcamp.web.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.TxDTO;

@Component
public interface TxMapper {
	public void insertTx(Command cmd);
	public void updateTx(Command cmd);
	public void deleteTx(Command cmd);
	public List<TxDTO> list(Command cmd);
	public List<TxDTO> selectByTx(Command cmd); // not pk
	public TxDTO selectById(Command cmd); // pk
	public int count();
}
