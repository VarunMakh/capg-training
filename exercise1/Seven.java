package exercise1;

import java.util.Scanner;

public class Seven {
	public static void main(String[] args) {
		Seven seven = new Seven();
		System.out.println("Enter any number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		if(seven.checkNumber(n)) {
			System.out.println("The number is increasing!");
		}
		else {
			System.out.println("The number is not increasing.");
		}
	}
	
	public boolean checkNumber(int n) {
		boolean check = true;
		int a;
		while(n != 0) {
			a = n % 10;
			n /= 10;
			if(a < (n % 10)) {
				check = false;
				break;
			}
		}
		return check;
	}
}
