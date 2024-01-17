package com.car.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.car.model.Car;
import com.car.repository.CarDAO;



@RestController
public class CarController {

	@Autowired
    CarDAO dao;
    
	
    public void performInsert( Car bean) {
        dao.insert(bean);
        System.out.println("Car Details Inserted");
        List<Car> list = dao.view();
        System.out.println(list);
    }
}

 