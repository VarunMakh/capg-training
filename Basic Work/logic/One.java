package logic;

import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		int i, j;
		System.out.println("Enter number of rows required:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(i = 1; i <= n; i++) {
			for(j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
