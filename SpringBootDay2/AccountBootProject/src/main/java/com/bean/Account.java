package com.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="account")
@NoArgsConstructor
@Data
public class Account {
	@Id
	private int aid;
	
	@Column(name="holder")
	private String customer;
	
	private double balance;
	private String email;
}






