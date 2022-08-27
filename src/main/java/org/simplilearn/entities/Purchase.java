package org.simplilearn.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Entity
//@Table(name = "purchase")
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Purchase {
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int reportId;
//	
//	@CreatedDate
//	private LocalDate localDate;
//	
//	@OneToMany(targetEntity = Product.class, cascade = CascadeType.ALL)
//	@JoinColumn(name = "cp_fk",referencedColumnName = "id")
//	private List<Product> product;
//
//	
//	@OneToMany(targetEntity = Product.class, cascade = CascadeType.ALL)
//	@JoinColumn(name = "cp_fk",referencedColumnName = "id")
//	private List<User> user;
//	
//	

}
