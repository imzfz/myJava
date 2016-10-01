package experiment3;

public class Circle extends Calculation{  //圆类继承Calculation类
	private double r;
	
	public Circle(){
		
	}
	
	public Circle(double r){		//设置半径
		this.r = r;
	}
	
	public double getArea(){		//计算面积
		return Math.PI * r * r;
	}
	
	public double getPerimeter(){		//计算周长
		return 2 * Math.PI * r;
	}
}
