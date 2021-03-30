package p1;

import java.util.Scanner;

public class StudentMarks {
	
	public static void main(String[] args) {
		
		int eng, java, spring, db, totalMarks, avgMarks;
		System.out.println("Please enter the marks for the student");
		Scanner sc = new Scanner(System.in);
		eng = sc.nextInt();
		java = sc.nextInt();
		spring = sc.nextInt();
		db = sc.nextInt();
		sc.close();
		
		totalMarks = eng + java + spring + db;
		avgMarks = totalMarks/4;
		
		System.out.print("The Total Marks are: " + totalMarks + "\nThe Average Marks are: " + avgMarks + "\n");
	}

}
