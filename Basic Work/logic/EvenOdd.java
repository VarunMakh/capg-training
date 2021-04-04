package logic;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		int i, j, even = 0 , odd = -1;
		System.out.println("Enter number of rows required:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(i = 1; i <= n; i++) {
			for(j = 0; j < i; j++) {
				if(i % 2 == 0) {
					System.out.print((even += 2) + " ");
				}
				else {
					System.out.print((odd +=2 ) + " ");
				}
			}
			System.out.println();
		}
	}

}
