package com.integration.camel;

import org.apache.camel.CamelContext;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:**/FileMoverTest-context.xml" })
public class FileMoverTest {

	@Autowired
	CamelContext camelContext;

	@Before
	public void setUp() throws Exception {

	}

	@Test
	public void test() throws InterruptedException {
		System.out.println("**********************STARTED***********************");
		Thread.currentThread().sleep(100000);
		System.out.println("**********************Ended***********************");
		
	}
	
	

}
