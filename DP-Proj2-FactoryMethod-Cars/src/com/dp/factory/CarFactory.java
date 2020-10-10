package com.dp.factory;

import com.dp.car.Cars2020;
import com.dp.car.FamilyCar;
import com.dp.car.LuxuryCars;
import com.dp.car.SportsCar;

public class CarFactory {

	public static Cars2020 getInstance(String type) {
		Cars2020 cars = null;
		if (type.equalsIgnoreCase("family"))
			cars = new FamilyCar();
		else if (type.equalsIgnoreCase("sports"))
			cars = new SportsCar();
		else if (type.equalsIgnoreCase("luxury"))
			cars = new LuxuryCars();
		cars.assemble();
		cars.cc();
		cars.range();
		cars.roadTest();
		return cars;
	}
}
