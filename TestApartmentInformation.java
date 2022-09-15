package com.arraytest.bll;

public class TestApartmentInformation {
	public static void main(String args[])
	{
		ApartmentInformation apinfo= new ApartmentInformation("Abhishek Kumar");  
		
		apinfo.setflat("Gulmohar apinfoartment,101",0);
		apinfo.setflat("Vinandini Villa,207",1);
		apinfo.setflat("Krishna Enclave,007",2);
		apinfo.setflat("Anandi Heights,669",3);
		apinfo.setflat("Ranchi Heights,089",4);
		//
		System.out.println(apinfo);
		
		System.out.println("********************");
		
		System.out.println(apinfo.getOwner()+" has " +apinfo.countflat()+" Flats"); 
		
		System.out.println("Flat 3 : " + apinfo.getflat(2));
		
		System.out.println("*********************");
		apinfo.reorganizeflat(); 
		
		System.out.println(apinfo); 
		
		
	}

}