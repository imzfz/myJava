package experiment2;

public class Line {
	private double length;
	private LinePoint point1 = new LinePoint();
	private LinePoint point2 = new LinePoint();		//定义点类型的变量
	
	public Line(){		//创建无参构造方法
		
	}
	
	public Line(int x1,int y1,int x2,int y2){		//创建有参构造方法
		point1.setX(x1);		//给点对象传入坐标
		point1.setY(y1);
		point2.setX(x2);
		point2.setY(y2);
	}
	
	public Line(LinePoint p1,LinePoint p2){		//创建直接导入线的有参构造方法
		point1 = p1;
		point2 = p2;
		
	}
	
	public double distance(){		//计算长度
		length = Math.sqrt(Math.pow(point1.getX() - point2.getX(), 2) + Math.pow(point1.getY() - point2.getY(), 2));
		return length;
	}
	
	public void setPoint1(LinePoint point){			//创建点的set方法和get方法
		point1 = point;
	}
	
	public LinePoint getPoint1(){
		return point1;
	}
	
	public void setPoint2(LinePoint point){
		point2 = point;
	}
	
	public LinePoint getPoint2(){
		return point2;
	}
	
	public double getLength(){		//创建长度的get方法
		return length;
	}
}
