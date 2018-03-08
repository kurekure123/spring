package com.bitcamp.web.service;

import java.util.List;
import org.springframework.stereotype.Component;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.FoodDTO;
import com.bitcamp.web.domain.LottoDTO;

@Component
public interface LottoService {
	public void addLotto (Command cmd);
	public void ModifyLotto(Command cmd);
	public void removeLotto(Command cmd);
	public List<LottoDTO> list(Command cmd);
	public List<LottoDTO> findByLotto(Command cmd); // not pk
	public LottoDTO findById(Command cmd); // pk
	public int count();
	public LottoDTO findLottoCount(LottoDTO param);
	public LottoDTO createLottoNumber(); //2, 4 ,13,29,33,41
	public List<LottoDTO> createLottos(); // 위 * findLottoCount
}
