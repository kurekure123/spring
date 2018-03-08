package com.bitcamp.web.mapper;

import java.util.List;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.FoodDTO;

public interface FoodMapper {
	public void insertFood (Command cmd);
	public void updateFood(Command cmd);
	public void deleteFood(Command cmd);
	public List<FoodDTO> list(Command cmd);
	public List<FoodDTO> selectByFood(Command cmd); // not pk
	public FoodDTO selectById(Command cmd); // pk
	public int count();
}
