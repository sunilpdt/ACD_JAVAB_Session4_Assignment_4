package com.acadgild;

import java.util.Scanner;

public class PerfectNumber
{
   public static void main (String[] args)
   {
	   
	  System.out.println("Enter the number:");
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       System.out.println("Perfect number between 1-100 are:");
       for(int j=1; j<n; j++)
       {
           int counter = 0;
           for (int i = 1; i < j; i++)         
           {              
               if(j%i ==0)
               {
                   counter = counter + i;
               }
           }
           
           if(counter == j)
               System.out.print(" "+j);//here you can print j or counter
       }
   }
}

