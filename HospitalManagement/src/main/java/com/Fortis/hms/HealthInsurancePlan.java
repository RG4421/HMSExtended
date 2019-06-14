package com.Fortis.hms;

public abstract class HealthInsurancePlan {
	 double coverage;
	 double premiumAmount;
	 InsuranceBrand insurancebrand;

	public void setCoverage(double coverage){
	    this.coverage = coverage;
	}
	public double getCoverage(){
	    return coverage;
	}
	public void setOfferedBy(InsuranceBrand insuranceBrand) {
		this.insurancebrand = insuranceBrand;
	}
	
public abstract double computeMonthltyPremium(double salary,int age, boolean smoking) ;


}
