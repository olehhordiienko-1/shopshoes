package com.example.springboot;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class ShoesShop implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name_shop;
	private String address_shop;
	private String number_shop;
	private String email_shop;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	private Shoes shoes;

	public ShoesShop() {
	}

	public ShoesShop(String shop_name, String address_shop, String number_shop, String email_shop, Shoes shoes) {
		this.name_shop = shop_name;
		this.address_shop = address_shop;
		this.number_shop = number_shop;
		this.email_shop = email_shop;
		this.shoes = shoes;
	}

	@Override
	public String toString() {
		return "ShoesShop: " +
				"id - " + id +
				" shop - " + name_shop +
				" address - " + address_shop +
				" pet - " + shoes +
				" number - " + number_shop +
				" email - " + email_shop;
	}
}