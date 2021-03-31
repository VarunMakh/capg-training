package p2;

import java.util.Scanner;

public class ArrayNoDuplicates {
	
	public static void main(String[] args) {
		
		ArrayNoDuplicates ad = new ArrayNoDuplicates();
		int arr1[] = new int[5];
		int arr2[] = new int[5];
		int element, i, j = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 5 values for the array!");
		
		for(i = 0; i < 5; i++) {
			element = sc.nextInt();
			ad.insertIntoArray(arr1, i, element);
		}
		
		i = 0;
		
		while(i < arr1.length) {
			if((ad.searchArray(arr2, arr1[i])) == 1) {
				i++;
			}
			else {
				ad.insertIntoArray(arr2, j, arr1[i]);
				j++;
				i++;
			}
		}
		
		ad.printArray(arr1);
		ad.printArray(arr2);
	}
	
	public void insertIntoArray(int arr[], int position, int element) {
		arr[position] = element;
	}
	
	public void printArray(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public int searchArray(int arr[], int element) {
		int temp = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == element) {
				temp = 1;
				break;
			}
			else {
				temp = 0;
			}
		}
		return temp;
	}
}
