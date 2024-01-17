package com.car;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.car.controller.CarController;
import com.car.model.Car;
import com.car.repository.CarDAO;

@SpringBootApplication
@ComponentScan
public class CarRentalModuleApplication {
	
	static CarDAO dao = new CarDAO();
	
	
	public Car menu() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Car ID,Date of Booking,From Location,To Location,Booked Name,Booked Phone No : ");
		return new Car(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.next(),sc.nextInt());
		
	}

	public static void main(String[] args) {
		SpringApplication.run(CarRentalModuleApplication.class, args);
		
		CarRentalModuleApplication obj = new CarRentalModuleApplication();
		
		Car bean = obj.menu();
		
		CarController controller = new CarController();
		
		controller.performInsert(bean);
	} 

}
