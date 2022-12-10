package com.example.springboot;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoesShopController {
	private static final Logger logger = Logger.getLogger(ShoesShopController.class);

	@Autowired
	private ShoesShopRepository shoesShopRepository;
	@Autowired
	private ShoesRepository shoesRepository;

	@GetMapping("/shop")
	public String blogMain(Model model) {
		 logger.info("[log] execution shoesShopRepository.findAll()");
		Iterable<ShoesShop> shoesShopRepositoryAll = shoesShopRepository.findAll();
		model.addAttribute("shoesshop", shoesShopRepositoryAll);

		Iterable<Shoes> shoesRepositoryAll = shoesRepository.findAll();
		logger.info("[log] execution shoesRepository.findAll()");
		model.addAttribute("shoes", shoesRepositoryAll);

		return shoesShopRepositoryAll.toString();
	}

}
