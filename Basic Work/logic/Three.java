package logic;

import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		int i, j, cnt = 1;
		System.out.println("Enter number of rows required:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(i = 1; i <= n; i++) {
			for(j = 0; j < (n - i); j++) {
				System.out.print(" ");
			}
			for(j = 0; j < cnt; j++) {
				if(i == n) {
					for(j = 0; j < cnt; j++) {
						System.out.print("*");
					}
				}
				else {
					if(j == 0 || j == (cnt - 1)) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
			}
			cnt += 2;
			System.out.println();
		}
	}

}
