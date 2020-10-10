package com.dp.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.dp.dept.Plan;
import com.dp.factory.FactoryPlan;

public class GenerateBill {
	public static void main(String[] args) throws IOException {
		FactoryPlan plan = null;
		BufferedReader br = null;
		String planName = null;
		Plan p = null;

		plan = new FactoryPlan();
		System.out.println("Enter Type of plan you use :: ");

		br = new BufferedReader(new InputStreamReader(System.in));

		planName = br.readLine();
		System.out.println("Enter Units :: ");
		int units = Integer.parseInt(br.readLine());

		p = plan.getPlan(planName);
		System.out.println("Your total Bill type is :: " + planName + "& bill of " + units + " units is => ");
		p.getRate();
		p.calculateBill(units);
	}
}
