package com.dp.test;

import com.dp.car.Cars2020;
import com.dp.factory.CarFactory;

public class TestPattern2 {
public static void main(String[] args) {
	Cars2020 cars = null;
	cars= CarFactory.getInstance("sports");
	System.out.println("Great choice sir.. The best Sports Car in this range.. Enjoy test drive..!!");
}
}
