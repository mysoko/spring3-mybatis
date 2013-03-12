package com.mining.app.service;

import org.springframework.stereotype.Service;

import com.mining.app.domain.Cardinfo;

@Service
public interface CardinfoService {

	Cardinfo getCardinfo(long id);
	
	Cardinfo getCardinfo(String cardNo);
	
	void insertCardinfo(Cardinfo cardinfo);
	
	void updateCardinfo(Cardinfo cardinfo);
}
