package com.ssr.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import com.ssr.StockscreenerApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = StockscreenerApplication.class)
@WebAppConfiguration
public class PortfolioControllerTest {

	private static final String APPLICATION_HAL_JSON = "application/hal+json";

	private MediaType mediaType = MediaType.valueOf(APPLICATION_HAL_JSON);

	// private MediaType contentType = new MediaType("application/json",
	// MediaType.APPLICATION_JSON.getSubtype(), Charset.forName("utf8"));

	private MockMvc mockMvc;

	@Autowired
	private WebApplicationContext webApplicationContext;

	@Before
	public void setup() throws Exception {
		this.mockMvc = webAppContextSetup(webApplicationContext).build();
	}

	@Test
	public void portfolioNotFound() throws Exception {
		mockMvc.perform(get("/portfolios/1"))
				.andExpect(status().isOk())
				.andExpect(content().contentType(mediaType));
//				.andExpect(jsonPath("$", hasSize(0)));
	}

}
