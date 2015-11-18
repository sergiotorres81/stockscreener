package com.ssr.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Portfolio {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "name", nullable = false)
	private String name;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "client_id", nullable = false)
	private Client client;

	@Column(name = "visibility", nullable = false)
	private String visibility;

	@JsonIgnore
	@OneToMany(mappedBy = "portfolio")
	private List<Operation> operations;

	/**
	 * 
	 */
	public Portfolio() {
		super();
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param name
	 */
	public Portfolio(String name) {
		super();
		this.name = name;
	}

	/**
	 * @return the operationList
	 */
	public List<Operation> getOperations() {
		return operations;
	}

	/**
	 * @param operationList
	 *            the operationList to set
	 */
	public void setOperationList(List<Operation> operations) {
		this.operations = operations;
	}


	/**
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}

	/**
	 * @param client
	 *            the client to set
	 */
	public void setClient(Client client) {
		this.client = client;
	}

	/**
	 * @return the visibility
	 */
	public String getVisibility() {
		return visibility;
	}

	/**
	 * @param visibility
	 *            the visibility to set
	 */
	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}

	public String toString(){
		return new ToStringBuilder(this).
			       append("id", id).
			       append("name", name).
			       append("visibility", visibility).
			       append("operations",operations).
			       append("client", client).
			       toString();
	}
	
}
