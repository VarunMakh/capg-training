package exercise1;

import java.util.Scanner;

public class One {
	
	public static void main(String[] args) {
		int a;
		One one = new One();
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		sc.close();
		System.out.println("The sum of the cubes of the digits of the entered number is: " + one.sumOfCubes(a));
		
	}
	
	public int sumOfCubes(int a) {
		int sum = 0;
		while(a != 0) {
			sum += ((a % 10) * (a % 10) * (a % 10));
			a /= 10;
		}
		return sum;
	}

}
