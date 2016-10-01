package experiment2;

public class Point {
	private double x,y,d;
	
	public Point(){		//无参构造方法默认坐标
		x = 1.0;
		y = 1.0;
	}
	
	public Point(double x,double y){		//有参构造方法传入坐标
		
	}
	
	public void setX(double x){		//坐标的set方法和get方法
		this.x = x;
	}
	
	public double getX(){
		return x;
	}
	
	public void setY(double y){
		this.y = y;
	}
	
	public double getY(){
		return y;
	}
	
	public String toString(){		//tostring 方法用于输出
		return ("x=" + x + " y=" + y + " the distance is " + d);
	}
	
	public double getDistance(double x1,double y1){		//计算长度
		d = Math.sqrt(Math.pow(x1-x,2) + Math.pow(y1-y,2));
		return d;
	}
}
