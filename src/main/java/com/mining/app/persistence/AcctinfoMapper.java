package com.mining.app.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.mining.app.domain.Acctinfo;

public interface AcctinfoMapper {

	Acctinfo getAcctinfoByAcctNo(Acctinfo acctinfo);
	
	Acctinfo getAcctinfoById(Acctinfo acctinfo);

	int insertAcctinfo(Acctinfo acctinfo);

	void updateAcctinfo(Acctinfo acctinfo);
	
	@Select("SELECT id, acct_no as acctNo, operators, total_amount as totalAmount FROM Acctinfo")
	List<Acctinfo> getAcctinfoList();
	
}
