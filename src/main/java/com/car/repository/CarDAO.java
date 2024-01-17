package com.car.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.car.model.Car;

@Repository
public class CarDAO {

static List<Car> list;
    
    public static boolean insert(Car bean) {
        list = new ArrayList<Car>();
        list.add(bean);
        return true;
    }
    
    public static List<Car> view(){
        return list;
    }

}

