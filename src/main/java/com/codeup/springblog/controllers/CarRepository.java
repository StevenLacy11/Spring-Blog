package com.codeup.springblog.controllers;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository <Car, Long> {
	List<Car> findAllByMake(String make);
}
