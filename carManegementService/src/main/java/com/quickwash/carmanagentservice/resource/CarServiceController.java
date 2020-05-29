package com.quickwash.carmanagentservice.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quickwash.carmanagentservice.entity.Car;
import com.quickwash.carmanagentservice.service.CarService;

@RestController
@RequestMapping("carService")
public class CarServiceController {
	
	@Autowired
	CarService carService;
	
	@PostMapping("/createCar")
	public void create(@RequestBody Car car) {
		carService.create(car);
	}
	
	@GetMapping("/getCarById/{id}")
	public Car find(@PathVariable String id) {
		return carService.getCarById(id);
		
	}

	@PutMapping("/updateCar")
	public void update(@RequestBody Car car) {
		carService.update(car);
	}

	@DeleteMapping("/deleteCar/{id}")
	public String delete(@PathVariable("id") String id) {
		return carService.deleteById(id);
	}

	@DeleteMapping("/deleteAllCars")
	public void deleteAll() {
		carService.deleteAll();
	}
    
	@GetMapping("/getCar")
	public Car find(Car car) {
		return carService.find(car);
		
	}
      
	@GetMapping("/getCarsByBrand/{brand}")
	public List<Car> findByBrand(@PathVariable("brand") String brand){
		return carService.findByBrand(brand);
		
	}
    
	@GetMapping("/getCarsByModel/{model}")
	public Car findByModel(@PathVariable("model") String model) {
		return carService.findByModel(model);
		
	}
    
	@GetMapping("/getAllCars")
	public List<Car> findAll(){
		return carService.findAll();
		
	}

}
