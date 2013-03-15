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
	
	// @Select("SELECT id, acct_no AS acctNo, operators, total_amount AS totalAmount FROM Acctinfo WHERE operators=#{operators}")
	@Select("SELECT * FROM Acctinfo WHERE operators=#{operators}")
	@Results({
		@Result(property = "acctNo", column = "acct_no"),
		@Result(property = "totalAmount", column = "total_amount")
	})
	List<Acctinfo> getAcctinfoByOperators(Acctinfo acctinfo);
}
