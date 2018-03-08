package com.bitcamp.web.serviceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.controller.HomeController;
import com.bitcamp.web.domain.LottoDTO;
import com.bitcamp.web.service.LottoService;

@Service
public class LottoServiceImpl implements LottoService{
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired LottoDTO lotto;

	@Override
	public LottoDTO findLottoCount(LottoDTO param) {
		logger.info("서비스 임플에서 입력받은 값은 : {} ", param.getMoney());
		if(Integer.parseInt(param.getMoney()) < 1000) {
			lotto.setCount(String.valueOf(0));
			} else if(Integer.parseInt(param.getMoney()) >= 100000) {
				lotto.setCount(String.valueOf(100));
				} else {
					lotto.setCount(String.valueOf(Integer.parseInt(param.getMoney())/1000));
			    }
		logger.info("로또 횟수 : {} ", lotto.getCount());
		
		/*	logger.info("서비스 임플에서 입력받은 값은 : ", param.getMoney());
		int count = 0;
		if (Integer.parseInt(param.getMoney()) < 100000) {
			count = Integer.parseInt(param.getMoney())/1000;
		} else {
			count = 100000/1000;
		}
		lotto.setCount(String.valueOf(count));*/
		return lotto;
	}
	@Override
	public LottoDTO createLottoNumber() {
	    logger.info("Move to {}", "createLotto");
	    int[] lottoNum = new int[6];
	    LottoDTO lottos = new LottoDTO();
	    for(int i=0; i<6; i++) {
	      int num = (int)(Math.random()*45)+1;
	      boolean exist = false;
	      for(int j=0; j<lottoNum.length; j++) {
	        if(num == lottoNum[j]) {
	          exist = true;
	          break;
	        }
	      }
	    if(exist) {
	      i--;
	      continue;
	    }else {
	      lottoNum[i]=num;
	    }
	    }
	    Arrays.sort(lottoNum);
	    lottos.setLottoNumber(Arrays.toString(lottoNum));
	    logger.info("생성된 로또 번호는 {}", Arrays.toString(lottoNum));
		return lottos;
	}
	@Override
	public List<LottoDTO> createLottos() {
		List<LottoDTO> list = new ArrayList<>();
		   for(int i=0; i<Integer.parseInt(lotto.getCount()); i++) {
			      list.add(createLottoNumber());
		   }
		   logger.info("LIST에 저장된 로또 번호는 {}", list);
		   return list;
	}
	@Override
	public void addLotto(Command cmd) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void ModifyLotto(Command cmd) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void removeLotto(Command cmd) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<LottoDTO> list(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<LottoDTO> findByLotto(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public LottoDTO findById(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

}
