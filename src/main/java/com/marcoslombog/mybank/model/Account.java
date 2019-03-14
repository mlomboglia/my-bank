package com.marcoslombog.mybank.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "accounts")
public class Account {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
		
		@NotBlank
	    private String name;
		
	    private Double  balance;

	    public Account() {
	    	super();
	    }
	    
	    public Account(String name, Double balance) {
	    	super();
	        this.setName(name);
	        this.setBalance(balance);
	    }

	    public Account(Long id, String name, Double balance) {
	    	super();
	    	this.setId(id);
	        this.setName(name);
	        this.setBalance(balance);
	    }

	    public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Double getBalance() {
			return balance;
		}

		public void setBalance(Double balance) {
			this.balance = balance;
		}

		@Override
	    public String toString() {
	        return "Account{" +
	                "id=" + id +
	                ", name='" + name + '\'' +
	                ", balance='" + balance + '\'' +
	                '}';
	    }
	}

