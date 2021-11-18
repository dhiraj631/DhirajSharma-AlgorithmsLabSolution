package com.greatlearning.main;
import java.util.Scanner;

public class MinimumNotes {
  private static Scanner sc = new Scanner(System.in);
   
   public static void main(String[] args) {
	   System.out.println ("Get the number of Deniminations");
	   int ndenomination = sc.nextInt();
	   
	   int[] notes = new int[ndenomination];
	   int[] numNotes = new int[ndenomination];
	   
	   System.out.println("Enter the currency denomination value");
	   for (int i = 0; i < ndenomination; i++) {
		  notes[i] = sc.nextInt();
	   }
	   MergeSortImplementation ms = new MergeSortImplementation();
	   ms.sort(notes, 0, notes.length - 1);
	   
	   for (int i = 0 ; i < ndenomination; i++) {
		   System.out.println(notes[i]);
	   }
	  
	   System.out.println("Please enter the amount");
	   int  amount = sc.nextInt();
	   
	   for(int i = 0; i < notes.length; i++) {
		  int  notes1 = (int) (amount / notes[i]);
		  numNotes[i] = notes1 ;
		  
		  amount = amount - (notes1 * notes[i]);
		  
		  if(i == notes.length - 1 && amount != 0) {
			  System.out.println("Not possible to pay entire amount");
		  }
		  else if (i == notes.length - 1 && amount != 0){
			  for (int j = 0 ; j < numNotes.length; j++) {
			  System.out.println(notes[j] + " " + numNotes[j] );
			  }
		  }
		  
	   }
	   
   }
}