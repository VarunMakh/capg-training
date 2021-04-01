package exercise1;

import java.util.Scanner;

public class Three {
	
	public static void main(String[] args) {
		
		int a=0, b=1, c=0;
		Three three = new Three();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number until which you want the Fibonacci series printed (Must be greater than 2:");
		int n = sc.nextInt();
		sc.close();
		System.out.print("Output (Recursive function): " + a + " " + b);
		three.recursiveFibonacci(a,b,c,n);
		System.out.print("\nOutput (Non-recursive function): " + a + " " + b);
		three.nonRecursiveFibonacci(a,b,c,n);
	}
	
	public void recursiveFibonacci(int a, int b, int c, int n) {
		if(c == 0) {
			n -= 2;
		}
		n--;
		c = a + b;
		System.out.print(" " + c);
		a = b;
		b = c;
		if(n != 0) {
			recursiveFibonacci(a,b,c,n);
		}
	}
	
	public void nonRecursiveFibonacci(int a, int b, int c, int n) {
		for(int i = 0; i < n-2; i++) {
			c = a + b;
			System.out.print(" " + c);
			a = b;
			b = c;
		}
	}

}
