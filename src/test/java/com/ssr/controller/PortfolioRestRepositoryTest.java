package com.ssr.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import com.ssr.StockscreenerApplication;
import com.ssr.repository.PortfolioRepository;

//@Sql("classpath:test-data.sql")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = StockscreenerApplication.class)
@WebAppConfiguration
@TransactionConfiguration(defaultRollback = true)
@IntegrationTest("server.port:0")
public class PortfolioRestRepositoryTest {

	private static final String APPLICATION_HAL_JSON = "application/hal+json";
	// hal+json is not included by default
	private MediaType mediaType = MediaType.valueOf(APPLICATION_HAL_JSON);

	@Value("${local.server.port}")
	private int port;

	private MockMvc mockMvc;

	@Autowired
	private WebApplicationContext webApplicationContext;

	@Autowired
	private PortfolioRepository portfolioRepository;

	@Before
	public void setup() throws Exception {
		this.mockMvc = webAppContextSetup(webApplicationContext).build();
	}

	@Test
	public void portfolioFound() throws Exception {
		mockMvc.perform(get("/portfolios/1")).andExpect(status().isOk())
				.andExpect(content().contentType(mediaType))
				.andExpect(jsonPath("$", Matchers.notNullValue()));
	}

	@Test
	public void portfolioNotFound() throws Exception {
		mockMvc.perform(get("/portfolios/2")).andExpect(status().isNotFound());
	}

	@Test
	public void portfolioFoundById() throws Exception {
		mockMvc.perform(get("/portfolios/1")).andExpect(status().isOk())
				.andExpect(content().contentType(mediaType))
				.andExpect(jsonPath("$.name", Matchers.startsWith("RV_Spain")));
	}

}
