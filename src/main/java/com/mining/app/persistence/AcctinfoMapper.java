package com.mining.app.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Select;

import com.mining.app.domain.Acctinfo;

public interface AcctinfoMapper {

	Acctinfo getAcctinfoByAcctNo(Acctinfo acctinfo);
	
	Acctinfo getAcctinfoById(Acctinfo acctinfo);

	// @Insert("insert into Acctinfo (acct_no, operators, total_amount) values (#{acctNo}, #{operators}, #{totalAmount})")
	// @Options(useGeneratedKeys = true, keyProperty = "id")
	int insertAcctinfo(Acctinfo acctinfo);

	void updateAcctinfo(Acctinfo acctinfo);
	
	@Select("select id, acct_no as acctNo, operators, total_amount as totalAmount from Acctinfo")
	List<Acctinfo> getAcctinfoList();
	
	// @Select("select id, acct_no as acctNo, operators, total_amount as totalAmount from Acctinfo where operators=#{operators}")
	@Select("select * from Acctinfo where operators=#{operators}")
	@Results({
		@Result(property = "acctNo", column = "acct_no"),
		@Result(property = "totalAmount", column = "total_amount")
	})
	List<Acctinfo> getAcctinfoByOperators(Acctinfo acctinfo);
	
}
