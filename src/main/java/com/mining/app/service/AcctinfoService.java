package com.mining.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mining.app.domain.Acctinfo;

@Service
public interface AcctinfoService {

	public Acctinfo getAcctinfo(int id);
	
	public Acctinfo getAcctinfo(String acctNo);
	
	public List<Acctinfo> getAcctinfoList();
	
	public void insertAcctinfo(Acctinfo acctinfo);
	
	public void updateAcctinfo(Acctinfo acctinfo);
}
