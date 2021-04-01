package exercise1;

import java.util.Scanner;

public class Four {
	public static void main(String[] args) {
		System.out.println("Enter a positive integer until which prime numbers should be printed:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		for(int i=2;i<n;i++)
		{
			int p=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0) {
					p=1;
					break;
				}
			}
			if(p==0)
				System.out.println(i);
		}
	}
}
