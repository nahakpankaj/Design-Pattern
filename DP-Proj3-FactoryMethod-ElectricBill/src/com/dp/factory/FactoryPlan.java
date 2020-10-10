package com.dp.factory;

import com.dp.dept.CommercialPlan;
import com.dp.dept.DomesticPlan;
import com.dp.dept.InstitutionalPlan;
import com.dp.dept.Plan;

public class FactoryPlan {
	public Plan getPlan(String planType) {
		if (planType == null) {
			return null;
		}
		if (planType.equalsIgnoreCase("domestic")) {
			return new DomesticPlan();
		} else if (planType.equalsIgnoreCase("commercial")) {
			return new CommercialPlan();
		} else if (planType.equalsIgnoreCase("institutional")) {
			return new InstitutionalPlan();
		}
		return null;
	}
}