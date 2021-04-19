package exercise3;

import java.util.Scanner;

public class Four {

	public static void main(String[] args) {
		Four four = new Four();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = Integer.parseInt(sc.nextLine());
		sc.close();
		System.out.println("Output: " + four.modifyNumber(num));
	}
	
	public int modifyNumber(int number1) {
		String number = Integer.toString(number1);
		StringBuffer n = new StringBuffer(number);
		for(int i = 0; i < n.length() - 1; i++) {
			n.setCharAt(i, Character.forDigit(Math.abs(Integer.parseInt(String.valueOf(n.charAt(i + 1))) - Integer.parseInt(String.valueOf(n.charAt(i)))), 10));
		}
		return Integer.parseInt(n.toString());
	}
}
