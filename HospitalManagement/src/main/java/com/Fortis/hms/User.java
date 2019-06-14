package com.Fortis.hms;

public class User {
	private long id;
	private String firstName;
	private String lastName;
	private String gender;
	private String email;
	private boolean insured;
	private int age;
	private boolean smoking;
	
	 HealthInsurancePlan insurancePlan;
	 InsuranceBrand brand;
	 
	 public void setOfferedby(InsuranceBrand b) {
		 if(b instanceof BlueCrossShield) {
			 brand = b;
		 }
	 }
	 public InsuranceBrand getOfferedby() {
		 return brand;
	 }
	 
	    
	    public void setInsurancePlan(HealthInsurancePlan H){
	        if(H instanceof PlatinumPlan) {
	        insurancePlan = H;
	        }
	        else if(H instanceof GoldPlan) {
	        	 insurancePlan = H;
	        	
	        }
	     
	        
	        	
	    }
	    public HealthInsurancePlan getInsurancePlan() {
			return insurancePlan;
	    	
	    }
	    public boolean getisInsured(){
		    return insured;
		}
		public void setisInsured(boolean insured){
		    this.insured = insured;
		}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName(){
	    return firstName;
	}
	public void setFirstName(String firstName){
	    this.firstName = firstName;
	}
	
		public String getLastName(){
	    return lastName;
	}
	public void setLastName(String lastName){
	    this.lastName = lastName;
	    
	}
	public String getGender(){
	    return gender;
	}
	public void setGender(String gender){
	    this.gender = gender;
	}
	
		public String getEmail(){
	    return email;
	}
	public void setEmail(String email){
	    this.email = email;
	}
	 
		public boolean isSmoking() {
			return smoking;
		}
		public void setSmoking(boolean smoking) {
			this.smoking = smoking;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
	
	
	
	public static void main(String[] args) {
		User staff = new User();
		staff.setFirstName("Amit");
		staff.setLastName("Kumar");
		staff.setEmail("amitkum123@gmail.com");
		staff.setGender("Male");
		staff.setId(3456);

				
	System.out.println(staff.getFirstName());
	System.out.println(staff.getLastName());
	System.out.println(staff.getEmail());
	System.out.println(staff.getGender());
	System.out.println(staff.getId());
      

	HealthInsurancePlan insuarancePlan = new PlatinumPlan();
    InsuranceBrand insuranceBrand = new BlueCrossShield();
      
    
    insuarancePlan.setOfferedBy(insuranceBrand);
    insuranceBrand.computeMonthlyPremium(insuarancePlan,5000, 60 , true);
     
    System.out.println("premium : "+premiumAmount);
    double premiumAmount = insuarancePlan.computeMonthltyPremium(5000, 60, true);
    System.out.println("premium amount : "+premiumAmount);
      
	}
     
    
   

}
