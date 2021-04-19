package exercise3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class One {

	public static void main(String[] args) {
		System.out.println("Please enter a line of integers (Separated by a space):");
		Scanner sc = new Scanner(System.in);
		String numbers = sc.nextLine();
		sc.close();
		StringTokenizer st = new StringTokenizer(numbers," ");
		int[] nums = new int[st.countTokens()];
		int cnt = 0;
		while(st.hasMoreTokens()) {
			nums[cnt++] = Integer.parseInt(st.nextToken()); 
		}
		int sum = 0;
		for(int n : nums) {
			sum += n;
			System.out.print(n + " ");
		}
		System.out.println("\nThe sum is: " + sum);
	}
}
