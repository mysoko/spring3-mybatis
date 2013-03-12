package com.mining.app.persistence;

import com.mining.app.domain.Cardinfo;

public interface CardinfoMapper {
	
	Cardinfo getCardinfoByCardNo(Cardinfo cardinfo);
	
	Cardinfo getCardinfoById(Cardinfo cardinfo);
	
	int insertCardinfo(Cardinfo cardinfo);
	
	void updateCardinfo(Cardinfo cardinfo);
	
}
