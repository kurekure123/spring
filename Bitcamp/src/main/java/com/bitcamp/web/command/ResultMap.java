package com.bitcamp.web.command;

import java.util.List;
import com.bitcamp.web.domain.AccountDTO;
import com.bitcamp.web.domain.FoodDTO;
import com.bitcamp.web.domain.LottoDTO;
import com.bitcamp.web.domain.MemberDTO;
import com.bitcamp.web.domain.MobileDTO;
import lombok.Data;

@Data
public class ResultMap {
	protected MemberDTO member;
	protected AccountDTO account;
	protected LottoDTO lotto;
	protected FoodDTO food;
	protected MobileDTO mobile;
	protected List<MemberDTO> members;
	protected List<AccountDTO> accounts;
	protected List<LottoDTO> lottos;
	protected List<FoodDTO> foods;
	protected List<MobileDTO> mobiles;
	protected boolean success;
	protected int count;
}
