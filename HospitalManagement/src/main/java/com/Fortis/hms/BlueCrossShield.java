package com.Fortis.hms;

public class BlueCrossShield implements InsuranceBrand {
	
	double coverage;
	double premiumAmount;
	 PlatinumPlan pref = new PlatinumPlan();
	 public void computeMonthlyPremium(HealthInsurancePlan H,double salary, int age, boolean Smoking) {
	              
				if(H instanceof PlatinumPlan) {
	            	   System.out.println("salary : "+salary + ", age : "+age + "smoking : "+Smoking);
					 premiumAmount = (double) pref.computeMonthltyPremium(salary, age, Smoking);
			         System.out.println("  premium Amount is "+  premiumAmount);
			
		}
				if(H instanceof GoldPlan) {
					 premiumAmount = (double) pref.computeMonthltyPremium(salary, age, Smoking);
			         System.out.println("  premium Amount is "+  premiumAmount);
			
		}
				
					
				}


}
