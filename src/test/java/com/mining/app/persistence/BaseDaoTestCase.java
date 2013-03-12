package com.mining.app.persistence;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

@ContextConfiguration(locations = {
		"classpath:/applicationContext-resources.xml",
		"classpath:/applicationContext.xml" })
public abstract class BaseDaoTestCase extends
		AbstractTransactionalJUnit4SpringContextTests {

}
