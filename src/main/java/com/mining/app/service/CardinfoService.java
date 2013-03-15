package com.mining.app.service;

import com.mining.app.domain.Cardinfo;

public interface CardinfoService {

	Cardinfo getCardinfo(long id);
	
	Cardinfo getCardinfo(String cardNo);
	
	void insertCardinfo(Cardinfo cardinfo);
	
	void updateCardinfo(Cardinfo cardinfo);
}
