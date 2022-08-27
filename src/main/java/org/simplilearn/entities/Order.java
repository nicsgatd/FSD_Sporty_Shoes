package org.simplilearn.entities;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.repository.Query;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "orders")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int reportId;

	private String purchasedate;	
	
	private String productid;
	
	private int price;
	
	private String userid;

	
//	@OneToOne(targetEntity = Product.class, cascade = CascadeType.ALL)
//	@JoinColumn(name = "cp_fk",referencedColumnName = "id")
//	private Product product;
//	
//	@OneToOne(targetEntity = User.class, cascade = CascadeType.ALL)
//	@JoinColumn(name = "cp_fk",referencedColumnName = "id1")
//	private User user;


	



	


}
