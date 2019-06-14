package com.Fortis.hms;

public class GoldPlan extends HealthInsurancePlan {
	
	 public void setCoverage(double amount){
		    
		    coverage =((amount* 0.8) + 40);
		    
		        
		    }
	 

	@Override
	public double computeMonthltyPremium(double salary,int age,boolean smoking) {
		 if(age>55) {
			 premiumAmount = (0.07*salary)+200;
		 }
			 else if(smoking) {
				 premiumAmount = (0.07*salary)+100;
			 }
			 else if(age>55 && smoking) {
				 premiumAmount = (0.07*salary)+100+200;
			 }
			 else {
				 premiumAmount = (0.07*salary);
			 }
		return premiumAmount;
	}
		

}
