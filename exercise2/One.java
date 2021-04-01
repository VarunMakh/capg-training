package exercise2;

import java.util.Arrays;
import java.util.Scanner;

public class One {
	public static void main(String[] args) {
		int n;
		One one = new One();
		System.out.println("How many elements in the array?");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("Enter the elements:");
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		System.out.println("The second smallest element in the array is: " + one.getSecondSmallest(arr));
	}
	
	public int getSecondSmallest(int arr[]) {
		Arrays.sort(arr);
		return arr[1];
	}
}
