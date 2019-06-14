package com.Fortis.hms;

public class PlatinumPlan extends HealthInsurancePlan{
	
	 public void setCoverage(double amount){
		    
		    coverage =((amount* 0.9) +50);
		    
		        
		    }

	
	
	 /* Read this conditions.

		here if both conditions are true then 300 will be added.
		if only age is greater than 55 and does not smoke then 200 will be added.
		if only smoking and age is less than 55 then only 100 will be added.
		if both conditions are invalid then 8% of salary will be premiumAmount.
		*/
	@Override
	public double computeMonthltyPremium(double salary, int age, boolean smoking) {
		
		//If age > 55 then add 200 to premium. If user smokes then add 100.
		
		premiumAmount = 0.08 * salary;
		
		if(age > 55) {
			premiumAmount = premiumAmount + 200;
		}
		
		if(smoking) {
			premiumAmount = premiumAmount + 100;
		}
		
		return premiumAmount;
		
		
		//------------------------------------
	/*	if(age>55) {
			 premiumAmount = (0.08*salary)+200;
		 }
			 else if(smoking) {
				 premiumAmount = ((0.08*salary)+100);
			 }
			 else if(age>55 && smoking) {
				 premiumAmount = ((0.08*salary)+100+200);
			 }
			 else {
				 premiumAmount = (0.08*salary);
			 }
		return premiumAmount;
	
	*/
	}

}
