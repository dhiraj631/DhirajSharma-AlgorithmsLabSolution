
package com.greatlearning.main;
import java.util.Scanner;



public class Transactions {
	private static Scanner sc =new Scanner(System.in);
	
	
     public static void main(String [] args) {
     System.out.println("Enter the size of transaction array");
     int size = sc.nextInt();
     
     int[] arr = new int[size];
    
     System.out.println("Enter the Transactions");
     for (int i = 0 ; i < size; i++ ) {
     arr[i] = sc.nextInt();
     }
     
     System.out.println("Enter the Total number of targets that needs to achieved");
     int ntarget = sc.nextInt();
     
     
     for (int i = 0; i < ntarget; i++) {
    	 
    	 System.out.println("Enter the value for the target;");
         int target = sc.nextInt();
    	 
         int sum = 0;
         for (int j = 0; j < arr.length; j++) {
    	   sum = sum + arr[j];
    	   
    	   if(sum >= target) {
    	     System.out.println("We have reached the target after "  + (j + 1) +  " transactions");
    	     break; 
    	   }  
    	   if (j == arr.length - 1 && sum < target) {
    		   System.out.println("Target is not acheived");
    	   
    	   }
         }
     
      }
        	 
   }
}

   