package com.ssr.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import java.nio.charset.Charset;
import java.util.List;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import com.ssr.StockscreenerApplication;


//@Sql("classpath:test-data.sql")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = StockscreenerApplication.class)
@WebAppConfiguration
@TransactionConfiguration(defaultRollback = true)
public class PortfolioControllerTest {

	private static final Logger logger = LoggerFactory.getLogger(PortfolioControllerTest.class);

	private MediaType mediaType = new MediaType(MediaType.APPLICATION_JSON.getType(),
			MediaType.APPLICATION_JSON.getSubtype(), Charset.forName("utf8"));


	private MockMvc mockMvc;

	@Autowired
	private WebApplicationContext webApplicationContext;

	@Before
	public void setup() throws Exception {
		logger.debug("Starting PortfolioControllerTest...");
		this.mockMvc = webAppContextSetup(webApplicationContext).build();
	}

	@Test
	public void portfolioFoundByNameTest() throws Exception {
		mockMvc.perform(get("/api/portfolios/RV_Spain"))
				.andExpect(status().isOk())
				.andExpect(content().contentType(mediaType))
				.andExpect(jsonPath("$.name", Matchers.hasToString("RV_Spain")));
	}
	
	@Test
	public void findPortfolioProductsTest() throws Exception {
		mockMvc.perform(get("/api/portfolios/RV_Spain/products"))
				.andExpect(status().isOk())
				.andExpect(content().contentType(mediaType))
				.andExpect(jsonPath("$", Matchers.isA(List.class)));
	}

	
	@Test
	public void findPortfolioOperations() throws Exception {
		mockMvc.perform(get("/api/portfolios/RV_Spain/operations"))
				.andExpect(status().isOk())
				.andExpect(content().contentType(mediaType))
				.andExpect(jsonPath("$", Matchers.isA(List.class)));
	}

}
