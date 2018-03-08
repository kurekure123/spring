package com.bitcamp.web.domain;

import org.springframework.stereotype.Component;
import lombok.Data;

@Data
@Component
public class TxDTO {
	private String txkey, id, foodSeq, count, total, regdate, telecom, phoneNum;
	private FoodDTO food;
	private MobileDTO mobile;
}