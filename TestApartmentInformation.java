package com.arraytest.bll;

public class TestApartmentInformation {
	public static void main(String args[])
	{
		ApartmentInformation apinfo= new ApartmentInformation("HULK");  
		
		apinfo.setflat("Kali Tower,101",0);
		apinfo.setflat("Kali Tower,102",1);
		apinfo.setflat("Kali Tower,103",2);
		apinfo.setflat("Kali Tower,104",3);
		apinfo.setflat("Kali Tower,105",4);
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