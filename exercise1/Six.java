package exercise1;

import java.util.Scanner;

public class Six {
	public static void main(String[] args) {
		Six six = new Six();
		System.out.println("Enter the value for n:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		System.out.println("The difference between the sum of the squares and the square of the sum of the first n natural numbers is: " + six.calculateDifference(n));
	}
	
	public int calculateDifference(int n) {
		int sumOfSquares = 0, squareOfSum = 0;
		for(int i = 1; i <= n; i++) {
			sumOfSquares += (i*i);
			squareOfSum += (i);
		}
		squareOfSum *= squareOfSum;
		return (sumOfSquares - squareOfSum);
	}
}
