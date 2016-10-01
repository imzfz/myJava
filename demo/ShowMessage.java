package demo;

public class ShowMessage {

	public static void main(String[] args) {
		No1();
		No2();
		No3();
		No4();
		No5();
		No6(); 
		No7();
		No9();
		No10();
		No11();
	}
	public static void No1 (){
		System.out.println("1.1");
		System.out.println("Welcome to Java");
		System.out.println("Welcome to Computer Science");
		System.out.println("Programming is fun");
		System.out.println("==========");
	}
	public static void No2(){
		System.out.println("1.2");
		for (int i = 0; i < 5; i++){
			System.out.println("Welcome to Java");
		}
		System.out.println("==========");
	}
	public static void No3(){
		System.out.println("1.4");
		System.out.println("a\ta^2\ta^3");
		System.out.println("1\t1\t1");
		System.out.println("2\t4\t8");
		System.out.println("3\t9\t27");
		System.out.println("4\t16\t64");
		System.out.println("==========");
	}
	public static void No4(){
		System.out.println("1.5");
		double result = 0;
		result = (9.5 * 4.5 - 2.5 * 3)/(45.5-3.5);
		System.out.println(result);
		System.out.println("==========");
	}
	public static void No5(){
		System.out.println("1.6");
		int result = 0;
		for(int i = 1; i < 10; i++ ){
			result += i;
		}
		System.out.println(result);
		System.out.println("==========");
	}
	public static void No6(){
		System.out.println("1.7");
		double result1,result2;
		result1 = 4 * (1.0 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11);
		result2 = result1 + 13/4;
		System.out.println(result1 + "\n" + result2);
		System.out.println("==========");
	}
	public static void No7(){
		System.out.println("1.8");
		int r = 5;
		double area,c;
		area = r * r * Math.PI;
		c = 2 * r * Math.PI;
		System.out.println(area + "\n" + c);
		System.out.println("==========");
	}
	public static void No8(){
		System.out.println("1.9");
		double l = 4.5,h = 7.9;
		double area,c;
		area = l * h;
		c = 2 * (l + h);
		System.out.println(area + "\n" + c);
		System.out.println("==========");
	}
	public static void No9(){
		System.out.println("1.10");
		double mile,time;
		mile = 14.0/1.6;
		time = 45.5/60.0;
		System.out.println(mile/time + "mile/h");
		System.out.println("==========");
	}
	public static void No10(){
		System.out.println("1.12");
		double km,time;
		km = 24.0 * 1.6;
		time = 1 + 40.0/60.0 + 35.0/3600.0;
		System.out.println(km/time + "km/h");
		System.out.println("==========");
	}
	public static void No11(){
		System.out.println("1.13");
		double a = 3.4,b = 50.2,c = 2.1,d = 0.55,e = 44.5,f = 5.9;
		double x,y;
		x = (e * d - b * f) / (a * d - b * c);
		y = (a * f - e * c) / (a * d - b * c);
		System.out.println("x = " + x  + "\ny = " + y);
		System.out.println("==========");
	}

}
