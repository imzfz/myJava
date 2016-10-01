package demo;

import java.util.Scanner;

public class Course {
	public static void main(String[] args){
	String courseName;
	Scanner input = new Scanner(System.in);
	String[] courseTeacher;
	
	int[] test = new int[3];
	
	for(int i = 0; i < 3; i++){
		test[i] = input.nextInt();
	}
	
	int[] test1 = new int[3];
	
	test1 = test;
	for(int i = 0; i < 3; i++){
	System.out.println(test[i]);
	System.out.println(test1[i]);
	}
	
	}
}
