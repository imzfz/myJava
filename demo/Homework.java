package demo;

import java.util.Scanner;

public class Homework {
	public static void main(String[] args){
		double[] javaScore = new double[30];
		double avg = 0;
		double sum = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Please input how many students:");
		int count = input.nextInt();
		System.out.println("Please input the scores:");
		for(int i = 0; i < count; i++){
			javaScore[i] = input.nextDouble();
			sum += javaScore[i];
		}
		avg = sum/count;
		System.out.println("Average is " + avg);
	}
}
