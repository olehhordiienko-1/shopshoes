package com.example.springboot;

import org.springframework.data.repository.CrudRepository;


public interface ShoesRepository extends CrudRepository<Shoes, Integer> { }