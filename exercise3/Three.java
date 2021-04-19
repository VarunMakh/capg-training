package exercise3;

import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		Three three = new Three();
		System.out.println("Enter any Word:");
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		sc.close();
		String altered = three.alterString(sentence);
		System.out.println(altered);
	}
	
	public String alterString(String str) {
		StringBuilder altered = new StringBuilder(str);
		for(int i = 0; i < altered.length(); i++) {
			//System.out.println(i);
			if(altered.toString().toLowerCase().charAt(i) != 'a' && altered.toString().toLowerCase().charAt(i) != 'e' && altered.toString().toLowerCase().charAt(i) != 'i' && altered.toString().toLowerCase().charAt(i) != 'o' && altered.toString().toLowerCase().charAt(i) != 'u') {
				altered.setCharAt(i, (char) (altered.charAt(i) + 1));
				//altered = altered.substring(0,i + 1) + String.valueOf((char) altered.charAt(i) + 1) + altered.substring(i + 2);
			}
		}
		return altered.toString();
	}

}

//if(altered.toLowerCase().charAt(i) != 'a' && altered.toLowerCase().charAt(i) != 'e' && altered.toLowerCase().charAt(i) != 'i' && altered.toLowerCase().charAt(i) != 'o' && altered.toLowerCase().charAt(i) != 'u') {
//if(altered.charAt(i) != 'a' && altered.charAt(i) != 'e' && altered.charAt(i) != 'i' && altered.charAt(i) != 'o' && altered.charAt(i) != 'u') {