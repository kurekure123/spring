package com.bitcamp.web.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class LottoDTO {
	private String randomNumber, count, lottoNumber, money; // 3
	//lottoNumber : 3 , 6, 13 , 23, 33, 43 
	//money : 5000원

	@Override
	public String toString() {
		return "LottoDTO [lottoNumber=" + lottoNumber + "] \n";
	}
	
	
}
