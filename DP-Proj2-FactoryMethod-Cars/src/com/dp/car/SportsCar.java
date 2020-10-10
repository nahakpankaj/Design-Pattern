package com.dp.car;

public class SportsCar extends Cars2020 {

	@Override
	public void assemble() {
	System.out.println("SportsCar.assemble() :: Made in INDIA");	
	}

	@Override
	public void roadTest() {
		System.out.println("SportsCar.roadTest() :: Specially Design for INDIAN roads. ");
	}

	@Override
	public void cc() {
		System.out.println("SportsCar.cc() :: 800CC.. Very Powerful");
	}

	@Override
	public void range() {
		System.out.println("SportsCar.range() :: Pocket Friendlly");
	}

}
