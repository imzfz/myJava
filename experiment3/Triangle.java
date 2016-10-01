package experiment3;


//public class Triangle implements InterfaceCal{
public class Triangle extends Calculation{		//三角形计算，继承Calculation类
	private double a,b,c;
	public Triangle(){
		
	}
	
	public Triangle(double a, double b, double c){		//输入边长并判断是否符合要求
		if(a + b > c && a + c > b && b + c > a && a > 0 && b > 0 && c > 0){
			this.a = a;
			this.b = b;
			this.c = c;
		}
		else{
			System.out.println("输入值有小于等于0的数字或其中两边之和没有大于第三边");
			System.exit(0);
		}
	}
	
	public double getArea(){		//计算面积
		double p = (a + b + c)/2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
	
	public double getPerimeter(){		//计算周长
		return a + b + c;
	}
/*	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}*/
}
