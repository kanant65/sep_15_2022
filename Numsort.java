package com.arraytest.bll;

import java.util.Scanner;

public class Numsort {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int numarr[]=new int[5]; 		
		
		System.out.println("Enter "+numarr.length + " numarrbers"); 
		for(int i=0;i<numarr.length;i++) {         
			numarr[i]=scanner.nextInt();
		}
		
			
		int flag=0;
		
		for(int i=0;i<numarr.length;i++)    
		{
			
			for(int j=i+1;j<numarr.length;j++) 	
			{
				if(numarr[i]>numarr[j])      
				{    
					flag=numarr[i];
					numarr[i]=numarr[j];
					numarr[j]=flag;
			    }
	       	}
		System.out.println(numarr[i]); 
		}
		scanner.close();

	}

}
