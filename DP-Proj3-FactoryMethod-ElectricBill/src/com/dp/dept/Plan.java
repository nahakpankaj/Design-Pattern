package com.dp.dept;

public abstract class Plan {

	protected double rate;

	public abstract void getRate();

	public void calculateBill(int units) {
		System.out.println("Your payable Bill is :: "+units * rate);
	}
}
