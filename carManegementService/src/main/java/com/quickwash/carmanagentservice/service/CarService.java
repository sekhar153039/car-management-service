package com.quickwash.carmanagentservice.service;

import java.util.List;

import com.quickwash.carmanagentservice.entity.Car;

public interface CarService {

	public void create(Car car);
	
	public Car getCarById(String id);

	public void update(Car car);

	public String deleteById(String id);

	public void deleteAll();

	public Car find(Car car);

	public List<Car> findByBrand(String brand);

	public Car findByModel(String model);

	public List<Car> findAll();

}
