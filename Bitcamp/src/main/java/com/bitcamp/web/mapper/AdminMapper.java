package com.bitcamp.web.mapper;

import java.util.List;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.AdiminDTO;

public interface AdminMapper {
	public void insertAdmin (Command cmd);
	public void updateAdmin(Command cmd);
	public void deleteAdmin(Command cmd);
	public List<AdiminDTO> list(Command cmd);
	public List<AdiminDTO> selectByAdmin(Command cmd); // not pk
	public AdiminDTO selectById(Command cmd); // pk
	public int count();
}
