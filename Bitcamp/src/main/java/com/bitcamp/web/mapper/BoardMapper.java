package com.bitcamp.web.mapper;

import java.util.List;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.BoardDTO;

public interface BoardMapper {
	public void insertBoard (Command cmd);
	public void updateBoard(Command cmd);
	public void deleteBoard(Command cmd);
	public List<BoardDTO> list(Command cmd);
	public List<BoardDTO> selectByBoard(Command cmd); // not pk
	public BoardDTO selectById(Command cmd); // pk
	public int count();
}
