package com.bitcamp.web.service;

import java.util.List;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.BoardDTO;

public interface BoardService {
	public void addBoard (Command cmd);
	public void ModifyBoard(Command cmd);
	public void removeBoard(Command cmd);
	public List<BoardDTO> list(Command cmd);
	public List<BoardDTO> findByBoard(Command cmd); // not pk
	public BoardDTO findById(Command cmd); // pk
	public int count();
}
