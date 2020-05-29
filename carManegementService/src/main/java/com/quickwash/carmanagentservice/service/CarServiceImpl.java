package com.quickwash.carmanagentservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quickwash.carmanagentservice.entity.Car;
import com.quickwash.carmanagentservice.repository.CarRepository;

@Service("carService")
public class CarServiceImpl implements CarService{
	
	@Autowired
     CarRepository carRepo;
	
	@Override
	public void create(Car car) {
		//Car c = carRepo.insert(car);
		Car c = carRepo.save(car);
		System.out.println("Created:- " + c);
		
	}

	@Override
	public void update(Car car) {
		Car c = carRepo.save(car);
		System.out.println("Updated:-" + c);
		
	}

	@Override
	public String  deleteById(String id) {
		carRepo.deleteById(id);
		return "car deleted with id "+ id;
	}

	@Override
	public void deleteAll() {
		carRepo.deleteAll();
		
	}

	@Override
	public Car find(Car car) {
		Optional<Car> findById = carRepo.findById(car.getId());
		return findById.get();
	}

	@Override
	public List<Car> findByBrand(String brand) {
		return carRepo.findByBrand(brand);
	}

	@Override
	public Car findByModel(String model) {
		return carRepo.findByModel(model);
	}

	@Override
	public List<Car> findAll() {
		return carRepo.findAll();
	}

	@Override
	public Car getCarById(String id) {
		return carRepo.findById(id).get();
	}
	

}
