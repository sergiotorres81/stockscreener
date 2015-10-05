package com.ssp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "ticker_Symbol", nullable = false)
	private String tickerSymbol;
	@Column(name = "ticker_Name", nullable = false)
	private String tickerName;

	public Product() {
	}

	/**
	 * @param id
	 * @param tickerSymbol
	 * @param tickerName
	 */
	public Product(String tickerSymbol, String tickerName) {
		super();
		this.tickerSymbol = tickerSymbol;
		this.tickerName = tickerName;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the tickerSymbol
	 */
	public String getTickerSymbol() {
		return tickerSymbol;
	}

	/**
	 * @param tickerSymbol
	 *            the tickerSymbol to set
	 */
	public void setTickerSymbol(String tickerSymbol) {
		this.tickerSymbol = tickerSymbol;
	}

	/**
	 * @return the tickerName
	 */
	public String getTickerName() {
		return tickerName;
	}

	/**
	 * @param tickerName
	 *            the tickerName to set
	 */
	public void setTickerName(String tickerName) {
		this.tickerName = tickerName;
	}

}
