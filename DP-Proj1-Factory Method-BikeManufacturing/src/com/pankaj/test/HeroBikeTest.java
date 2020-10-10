package com.pankaj.test;

import com.pankaj.dp.HeroBikes;
import com.pankaj.factory.ChennaiFactory;
import com.pankaj.factory.HeroFactory;

public class HeroBikeTest {

	public static void main(String[] args) {
		HeroBikes bikes = null;
		HeroFactory factory = null;
		factory = new ChennaiFactory();
		bikes = factory.orderBikes("HfDeluxe");
		System.out.println("Hero HfDeluxe is ready for Indian Market..");
	}
}
