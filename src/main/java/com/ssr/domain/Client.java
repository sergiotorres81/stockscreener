package com.ssr.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "email", nullable = false)
	private String email;

	@JsonIgnore
	@OneToMany(mappedBy = "client")
	private List<Portfolio> portfolios;

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
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the portfolios
	 */
	public List<Portfolio> getPortfolios() {
		return portfolios;
	}

	/**
	 * @param portfolios
	 *            the portfolios to set
	 */
	public void setPortfolios(List<Portfolio> portfolios) {
		this.portfolios = portfolios;
	}


}
