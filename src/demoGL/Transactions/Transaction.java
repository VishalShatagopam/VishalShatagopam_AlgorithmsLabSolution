package demoGL.Transactions;

import java.util.Scanner;

public class Transaction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of transaction array: ");
		int size= sc.nextInt();
		int[] tranArray= new int[size];
		for(int i=0; i< size; i++) {
			System.out.println("Enter the values of "+(i+1)+" transaction");
			tranArray[i]= sc.nextInt();
		}
		System.out.println("Enter the total no of targets that needs to be achieved: ");
		int noOfTargets = sc.nextInt();
		for(int i=0; i<noOfTargets; i++) {
			int sum = 0;
			System.out.println("Enter the value of target:");
			int targetValue= sc.nextInt();			
			 for(int j=0; j<size; j++) {
				sum = sum +	tranArray[i];
				if(sum>=targetValue) {
					System.out.println("Target acheived after "+ (j+1) +" transactions");
					break;
				}
				
			 }
			if(sum<targetValue) {
					System.out.println("Target not acheived");
			}			
		}
		sc.close();		
 }
}
