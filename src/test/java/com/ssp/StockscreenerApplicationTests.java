package com.ssp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import com.ssr.StockscreenerApplication;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = StockscreenerApplication.class)
@WebAppConfiguration
public class StockscreenerApplicationTests {

	@Test
	public void contextLoads() {
	}

}
