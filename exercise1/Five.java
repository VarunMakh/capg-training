package exercise1;

import java.util.Scanner;

public class Five {
	public static void main(String[] args) {
		Five five = new Five();
		System.out.println("Enter the number of values to sum up that are divisble by 3 and 5:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		System.out.println("The sum is: " + five.calculateSum(n));
	}
	
	public int calculateSum(int n) {
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			if(((i%3) == 0) && ((i%5) == 0)) {
				sum += i;
			}
		}
		return sum;
	}
}
