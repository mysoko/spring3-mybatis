package com.mining.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mining.app.domain.Acctinfo;
import com.mining.app.persistence.AcctinfoMapper;
import com.mining.app.service.AcctinfoService;

public class AcctinfoServiceImpl implements AcctinfoService {
	
	@Autowired
	private AcctinfoMapper acctinfoMapper;

	public Acctinfo getAcctinfo(int id) {
		Acctinfo acctinfo = new Acctinfo();
		acctinfo.setId(id);
		return acctinfoMapper.getAcctinfoById(acctinfo);
	}

	public Acctinfo getAcctinfo(String acctNo) {
		Acctinfo acctinfo = new Acctinfo();
		acctinfo.setAcctNo(acctNo);
		return acctinfoMapper.getAcctinfoByAcctNo(acctinfo);
	}

	public List<Acctinfo> getAcctinfoList() {
		return acctinfoMapper.getAcctinfoList();
	}

	public void insertAcctinfo(Acctinfo acctinfo) {
		acctinfoMapper.insertAcctinfo(acctinfo);
	}

	public void updateAcctinfo(Acctinfo acctinfo) {
		acctinfoMapper.updateAcctinfo(acctinfo);
	}
	
	
}
