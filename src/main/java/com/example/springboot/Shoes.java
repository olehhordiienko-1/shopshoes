package com.example.springboot;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
public class Shoes implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private boolean is_new;
	private double size_shoes;

	@Column(unique = true)
	private String model_shoes;

	@OneToMany(mappedBy = "shoes", fetch = FetchType.LAZY,
			cascade = CascadeType.ALL)
	private Set<ShoesShop> shoesShops;

	public Shoes() {
	}

	public Shoes(String model_shoes, boolean is_new, double size_shoes) {
		this.model_shoes = model_shoes;
		this.is_new = is_new;
		this.size_shoes = size_shoes;
	}

	@Override
	public String toString() {
		return "Shoes: " +
				"id - " + id +
				" model - " + model_shoes +
				" is new - " + is_new +
				" size - " + size_shoes;
	}
}