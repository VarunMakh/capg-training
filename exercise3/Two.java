package exercise3;

import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		Two two = new Two();
		System.out.println("Enter a string to be reversed:");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		String rev = two.getImage(str);
		System.out.println(str + " | " + rev);
	}
	
	public String getImage(String str) {
		StringBuffer sb = new StringBuffer(str); 
		return sb.reverse().toString();
	}

}
