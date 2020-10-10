package com.dp.car;

public class FamilyCar extends Cars2020 {

	@Override
	public void assemble() {
		System.out.println("FamilyCar.assemble() :: indian Unit");
	}

	@Override
	public void roadTest() {
		System.out.println("FamilyCar.roadTest() :: nice grip");
	}

	@Override
	public void cc() {
		System.out.println("FamilyCar.cc() :: 350CC");
	}

	@Override
	public void range() {
		System.out.println("FamilyCar.range() :: upto 4L");
	}

}
