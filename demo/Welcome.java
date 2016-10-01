package demo;

import java.util.Scanner;

/*public class Welcome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		System.out.println("please input seconds");
		Scanner input = new Scanner(System.in);
		int seconds = input.nextInt();
		int t = seconds;
		long startTime = System.nanoTime();
		while(seconds >= 60){
			seconds = seconds - 60;
			i = i + 1;
		}
		System.out.println("The result is " + i +" min " + seconds + " s");
		long endTime = System.nanoTime();
		long time = endTime - startTime;
		System.out.println(time);
		
		seconds = t;
		long startTime1 = System.nanoTime();
		i = t / 60;
		t = t % 60;
		System.out.println("The result is " + i +" min " + t + " s");
		long endTime1 = System.nanoTime();
		long time1 = endTime - startTime;
		System.out.println(time1);
	}
}*/

public class Welcome {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int i = (int)(Math.random()*10+1);
		int j = (int)(Math.random()*10+1);
		int k = (int)(Math.random()*10/3);
		char fuhao = 0;
		int answer = 0;
		if(k == 0){
			fuhao = '+';
			answer = i + j;
		}
		if(k == 1){
			fuhao = '-';
			answer = i - j;
		}
		if(k == 2){
			fuhao = '*';
			answer = i * j;
		}
		if(k == 3){
			fuhao = '/';
			answer = i / j;
		}
		System.out.print("" + i + fuhao + j + "=");
		int result = input.nextInt();
		if(result == answer){
			System.out.println("true");
		}
		else
			System.out.println("false");
	}
}




















