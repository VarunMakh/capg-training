package exercise3;

import java.util.Scanner;

public class Six {
	
	public static void main(String[] args) {
		Six six = new Six();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String str = sc.nextLine();
		System.out.println("The String is a " + six.checkPositive(str) + " string");
	}
	
	public String checkPositive(String str) {
		String op = "positive";
		for(int i = 0; i < str.length() - 1; i++) {
			int a = str.toUpperCase().charAt(i);
			int b = str.toUpperCase().charAt(i + 1);
			if(a >= b) {
				op = "negative";
				break;
			}
			
		}
		return op;
	}
}
