package com.arraytest.bll;

import java.util.Scanner;

public class StringSort {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String strngarr[]=new String[5];  	
		
		System.out.println("Enter "+strngarr.length + " strngarrs");
		for(int i=0;i<strngarr.length;i++) {		
			strngarr[i]=scanner.next();
		}
			
		for(int i=0;i<strngarr.length;i++)	
			{
			for(int j=i+1;j<strngarr.length;j++)  	
			{
				if(strngarr[i].compareTo(strngarr[j])>0)	
				{	
					String temp=strngarr[i];
					strngarr[i]=strngarr[j];
					strngarr[j]=temp;
				}
			}
		}
		
		for(int i=0;i<strngarr.length;i++)
		{  	
			System.out.println(strngarr[i]);
		}
		
	scanner.close();

	}

}
