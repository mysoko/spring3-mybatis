package com.mining.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mining.app.domain.Cardinfo;
import com.mining.app.persistence.CardinfoMapper;
import com.mining.app.service.CardinfoService;

@Service
public class CardinfoServiceImpl implements CardinfoService {
	
	@Autowired
	private CardinfoMapper cardinfoMapper;

	public Cardinfo getCardinfo(long id) {
		Cardinfo cardinfo = new Cardinfo();
		cardinfo.setId(id);
		return cardinfoMapper.getCardinfoById(cardinfo);
	}

	public Cardinfo getCardinfo(String cardNo) {
		Cardinfo cardinfo = new Cardinfo();
		cardinfo.setCardNo(cardNo);
		return cardinfoMapper.getCardinfoByCardNo(cardinfo);
	}

	public void insertCardinfo(Cardinfo cardinfo) {
		cardinfoMapper.insertCardinfo(cardinfo);
	}

	public void updateCardinfo(Cardinfo cardinfo) {
		cardinfoMapper.updateCardinfo(cardinfo);
	}
	
}
