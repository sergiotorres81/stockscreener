package com.ssp.domain;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Operation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "date", nullable = false)
	private Date date;
	@OneToOne
	@JoinColumn(name = "id", nullable = false)
	private Product product;
	@Column(name = "price", nullable = false)
	private Double price;
	@Column(name = "quantity", nullable = false)
	private Long quantity;
	@Column(name = "commission", nullable = false)
	private Double commission;
	@Column(name = "currency", nullable = false)
	private String currency;
	@Column(name = "type", nullable = false)
	private String type; // BUY/SELL/DIVIDEND/SCRIP

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "portfolio_id")
	private Portfolio portfolio;

	public Operation() {
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}


	/**
	 * @return the product
	 */
	public Product getProduct() {
		return product;
	}

	/**
	 * @param product
	 *            the product to set
	 */
	public void setProduct(Product product) {
		this.product = product;
	}

	/**
	 * @return the pricePerStock
	 */
	public Double getPrice() {
		return price;
	}

	/**
	 * @param pricePerStock the pricePerStock to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}

	/**
	 * @return the quantity
	 */
	public Long getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the commission
	 */
	public Double getCommission() {
		return commission;
	}

	/**
	 * @param commission the commission to set
	 */
	public void setCommission(Double commission) {
		this.commission = commission;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * @param currency
	 *            the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	/**
	 * @param date
	 * @param product
	 * @param price
	 * @param quantity
	 * @param commission
	 * @param currency
	 * @param type
	 * @param portfolio
	 */
	public Operation(Date date, Product product, Double price, Long quantity, Double commission, String currency,
			String type, Portfolio portfolio) {
		super();
		this.date = date;
		this.product = product;
		this.price = price;
		this.quantity = quantity;
		this.commission = commission;
		this.currency = currency;
		this.type = type;
		this.portfolio = portfolio;
	}

	
	
}
