package com.pankaj.factory;

import com.pankaj.dp.HeroBikes;
import com.pankaj.dp.HfDeluxe;
import com.pankaj.dp.SplenderPlus;

public class ChennaiFactory extends HeroFactory {

	@Override
	public HeroBikes manufacturingBike(String type) {
		HeroBikes heroBikes = null;
		if (type.equalsIgnoreCase("splenderPlus"))
			heroBikes = new SplenderPlus();
		else if (type.equalsIgnoreCase("HfDeluxe"))
			heroBikes = new HfDeluxe();
		return heroBikes;
	}
}
