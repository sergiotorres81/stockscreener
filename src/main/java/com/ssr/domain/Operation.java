package com.ssr.domain;


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

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Operation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "operation_date", nullable = false)
	private Date operationDate;

	@OneToOne
	@JoinColumn(name = "product_id", nullable = false)
	private Product product;

	@Column(name = "price", nullable = false)
	private Double price;

	@Column(name = "quantity", nullable = false)
	private Long quantity;

	@Column(name = "commission", nullable = false)
	private Double commission;

	@Column(name = "currency", nullable = false)
	private String currency;

	@Column(name = "operation_type", nullable = false)
	private String operationType; // BUY/SELL/DIVIDEND/SCRIP

	// Note: don't like to use eager, but I couldn't get rid of this exception:
	// {
	// "cause": null,
	// "message":
	// "Id must be assignable to Serializable! Object of class [null] must be an instance of interface java.io.Serializable"
	// }
	// It is a documented issue, find below another possible workaround
	// https://jira.spring.io/si/jira.issueviews:issue-html/DATAJPA-630/DATAJPA-630.html

	@JsonIgnore
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "portfolio_id", nullable = false)
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
	 * @return the operationDate
	 */
	public Date getOperationDate() {
		return operationDate;
	}

	/**
	 * @param operationDate
	 *            the operationDate to set
	 */
	public void setOperationDate(Date operationDate) {
		this.operationDate = operationDate;
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
	 * @return the operationType
	 */
	public String getOperationType() {
		return operationType;
	}

	/**
	 * @param operationType
	 *            the operationType to set
	 */
	public void setOperationType(String operationType) {
		this.operationType = operationType;
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
	 * @return the portfolio
	 */
	public Portfolio getPortfolio() {
		return portfolio;
	}

	/**
	 * @param portfolio
	 *            the portfolio to set
	 */
	public void setPortfolio(Portfolio portfolio) {
		this.portfolio = portfolio;
	}

	/**
	 * @param date
	 * @param price
	 * @param quantity
	 * @param commission
	 * @param currency
	 * @param type
	 * @param product
	 * @param portfolio
	 */
	public Operation(Date operation_date, Double price, Long quantity, Double commission,
 String currency,
			String operationType, Product product, Portfolio portfolio) {
		super();
		this.operationDate = operation_date;
		this.price = price;
		this.quantity = quantity;
		this.commission = commission;
		this.currency = currency;
		this.operationType = operationType;
		this.product = product;
		this.portfolio = portfolio;
	}

	
	
}
