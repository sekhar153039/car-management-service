package com.quickwash.carmanagentservice.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.quickwash.carmanagentservice.entity.Car;

public interface CarRepository extends MongoRepository<Car, String>{
	@Query(value = "{ 'model' : ?0}")
	Car findByModel(String model);

	@Query(value = "{ 'brand' : ?0}")
	List<Car> findByBrand(String brand);
}
