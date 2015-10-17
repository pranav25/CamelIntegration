package com.integration.camel;

import org.apache.camel.CamelContext;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:**/FileMoverTest-context.xml"})
public class FileMoverJavaRouteTest {


	@Test
	public void javaRoutesShouldMoveFiles() throws InterruptedException {
		System.out
				.println("**********************Started Java RouterBuilder***********************");
		Thread.currentThread().sleep(100000);
		System.out
				.println("**********************Ended Java RouterBuilder***********************");

	}

}
