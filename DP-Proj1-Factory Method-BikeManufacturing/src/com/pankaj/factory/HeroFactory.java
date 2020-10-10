package com.pankaj.factory;

import com.pankaj.dp.HeroBikes;

public abstract class HeroFactory {
	public abstract HeroBikes manufacturingBike(String type);

	public HeroBikes orderBikes(String type) {
		HeroBikes heroBikes = null;

		heroBikes = manufacturingBike(type);
		heroBikes.color();
		heroBikes.assumble();
		heroBikes.oiling();
		heroBikes.roadTest();
		return heroBikes;
	}
}
