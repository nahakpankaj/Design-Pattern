package com.dp.test;

import com.dp.car.Cars2020;
import com.dp.factory.CarFactory;

public class TestPattern1 {
	public static void main(String[] args) {
		Cars2020 cars = null;
		cars = CarFactory.getInstance("family");
		System.out.println("Your car is ready for take home.. thank you..!!");
	}
}
