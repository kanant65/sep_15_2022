package com.arraytest.bll;

public class ApartmentInformation {

	private String owner;
	private String[] flat;
	
	public ApartmentInformation(String owner) 
	{
		this.owner=owner;      
		flat=new String[10];    
	}
	
	public String getOwner()   
	{
		return owner;
	}
	
	public String getflat(int slot)    
	{
		return flat[slot];
	}
	
	public void setflat(String address,int slot) 
	{
		flat[slot]=address;
	}
	
	public int countflat()    
	{
		int num=0;
		for(int i=0;i<10;i++)
			if(flat[i] !=null)
				num++;
		return num;
	}
	
	public void reorganizeflat() 
	{
		int empty=-1;
		for(int i=0;i<10;i++)
		{
			if(flat[i]==null && empty !=-1)
				empty=i;
			if(flat[i]!=null && empty != -1)
			{
				flat[empty]=flat[i];
				flat[i]=null;
				empty++;
			}
		}	
	}
	
	@Override
	public String toString()
	{
		String ris="";
		ris+="Owner: "+owner;
		for(int i=0;i<10;i++)
			if(flat[i]!=null)
				ris+="\n Flat "+i+": "+flat[i];
		return ris;
	}
	
}