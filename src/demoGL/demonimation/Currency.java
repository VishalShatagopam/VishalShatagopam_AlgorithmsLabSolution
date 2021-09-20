package demoGL.demonimation;

import java.util.Scanner;
public class Currency {
	
public static void merge(int arr[],int first,int mid,int last) {
	
	int len1 = mid-first+1;
	int len2 = last-mid;
	int[] la= new int[len1];
	int[] ra= new int[len2];
	
	for(int i=0; i<len1;i++) {
		la[i]=arr[first+i];
	}
	for(int i=0; i<len2;i++) {
		ra[i]=arr[mid+1+i];
	}
	int i=0, j=0, k=first;
	while (i<len1 && j<len2) {
		if(la[i]>=ra[j]) {
			
			arr[k]= la[i];
			i++;
		}
		else {
			arr[k]= ra[j];
			j++;		
		}
		k++;
	}
	while(i< len1){
		arr[k]= la[i];
		k++;
		i++;
	}
	while(j<len2) {
		arr[k]= ra[j];
		k++;
		j++;
	}	
}
	

	public static void mergeSort(int[] arr, int first, int last ) {
		int mid;
		if(first<last) {
		mid = (first+last)/2;
			
			mergeSort(arr,first,mid);
			mergeSort(arr,mid+1,last);
			merge(arr,first,mid,last);
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the number of denominations: ");
		Scanner sc= new Scanner(System.in);
		int N= sc.nextInt();
		int denominations[]= new int[N];
		System.out.println("Enter denominations: ");
		for(int i=0;i<N;i++) {
			denominations[i]= sc.nextInt();
		}
		mergeSort(denominations,0,denominations.length-1);
		System.out.println("Merge sorted array is:");
		for(int i=0;i<denominations.length;i++) {
			System.out.println(denominations[i]);
		}
		System.out.println("Enter the amount :");
		int amount= sc.nextInt();
		for(int i=0; i<denominations.length; i++) {
			if(amount>=denominations[i]) {
			int notes = amount/denominations[i];
			System.out.println(denominations[i]+" : "+ notes);
			}
			amount = amount%denominations[i];
		}
		if(amount>0) {
			System.out.println("Remaning Amount :"+ amount);
		}
		sc.close();
	}	
}


