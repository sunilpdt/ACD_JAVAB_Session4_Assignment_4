package com.acadgild;

import java.util.Scanner;

public class Aliquot {

	 public static void main(String args[])
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("\nInsert a number :: ");
	        int number = sc.nextInt();
	       
	        int i=1, sum=0;
	       
	        for(i=1; i<number; i++)
	        {
	            if(number%i == 0)
	            {
	                sum += i;
	            }
	        }
	       
	        if(sum == number)
	        {
	            System.out.println("\nThis is a perfect number.");           
	        }
	        else
	        {
	            System.out.println("\nThis is not a perfect number.");
	        }       
	    }

}
