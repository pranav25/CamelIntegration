package com.integration.camel;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:camelSpringCBR.xml" })
public class ContentBasedRouterTest {

	@Before
	public void setUp() throws Exception {

	}

	
	@Test
	public void springRoutesShouldMoveFilesBasedOnExtn() throws InterruptedException {
		System.out
				.println("**********************Started Content Based Java Router Builder***********************");
		Thread.currentThread().sleep(100000);
		System.out
				.println("**********************Ended Content Based Java Router Builder*********************************************************");

	}

}
