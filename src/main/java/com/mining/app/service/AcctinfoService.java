package com.mining.app.service;

import java.util.List;

import com.mining.app.domain.Acctinfo;

public interface AcctinfoService {

	public Acctinfo getAcctinfo(int id);
	
	public Acctinfo getAcctinfo(String acctNo);
	
	public List<Acctinfo> getAcctinfoList();
	
	public void insertAcctinfo(Acctinfo acctinfo);
	
	public void updateAcctinfo(Acctinfo acctinfo);
}
