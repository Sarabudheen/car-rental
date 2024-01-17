package com.car.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.car.model.Car;
import com.car.repository.CarDAO;

@SpringBootTest
class CarDAOTest {
	
	@Autowired
	static CarDAO dao;
	Car car = new Car(101,"Jan_01_2024","Cuddalore","Chennai","Sara",701043);
	
	@Test
	void contextLoads() {
	}

	
	@Test
	void testInsert() {
		dao = new CarDAO();
		boolean expectedValue = true;
		boolean actualValue = dao.insert(car);
		assertEquals(actualValue, expectedValue);
	}

}
