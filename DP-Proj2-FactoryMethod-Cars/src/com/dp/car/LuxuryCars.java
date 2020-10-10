package com.dp.car;

public class LuxuryCars extends Cars2020 {

	@Override
	public void assemble() {
		System.out.println("LuxuryCars.assemble() :: Imoprt from USA");
	}

	@Override
	public void roadTest() {
		System.out.println("LuxuryCars.roadTest() :: not for Indian Roads");
	}

	@Override
	public void cc() {
		System.out.println("LuxuryCars.cc() :: 450-500cc");
	}

	@Override
	public void range() {
		System.out.println("LuxuryCars.range() :: upto 10L");
	}

}
