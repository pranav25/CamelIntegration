package com.integration.camel;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:**/FilemoverSpringConfig.xml" })
public class FileMoverSpringRouteTest {

	@Before
	public void setUp() throws Exception {

	}

	@Test
	public void testJavaRoutes() throws InterruptedException {
		System.out
				.println("**********************STARTED***********************");
		Thread.currentThread().sleep(100000);
		System.out
				.println("**********************Ended***********************");

	}

	@Test
	public void springRoutesShouldMoveFiles() throws InterruptedException {
		System.out
				.println("**********************Started Java RouterBuilder***********************");
		Thread.currentThread().sleep(100000);
		System.out
				.println("**********************Ended Java RouterBuilder***********************");

	}

}
