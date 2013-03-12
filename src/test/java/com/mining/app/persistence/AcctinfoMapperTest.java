package com.mining.app.persistence;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.mining.app.domain.Acctinfo;

public class AcctinfoMapperTest extends BaseDaoTestCase {

	@Autowired
	private AcctinfoMapper acctinfoMapper;

	@Test
	public void insertAcctinfoTest() {
		Acctinfo acctinfo = new Acctinfo();
		acctinfo.setAcctNo("test333");
		acctinfo.setOperators("CM");
		acctinfo.setTotalAmount(111);
		acctinfo.setId(acctinfoMapper.insertAcctinfo(acctinfo));
		assertEquals(acctinfo.getId(), 1);
	}

	@Test
	public void getAcctinfosTest() {
		List<Acctinfo> acctinfoList = acctinfoMapper.getAcctinfoList();
		assertTrue(acctinfoList.size() > 0);
	}

}
