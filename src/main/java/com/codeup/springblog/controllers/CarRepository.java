package com.codeup.springblog.controllers;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository <Car, Long> {
//	List<Car> findAllByMake(String make);
	Car findAllByMake(String make);
}
