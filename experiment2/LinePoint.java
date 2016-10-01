package experiment2;

public class LinePoint {
	private int x;
	private int y;
	
	public LinePoint(){		//创建无参构造方法
		
	}
	
	public LinePoint(int _x,int _y){		//有参方法传入点坐标
		x = _x;
		y = _y;
	}
	
	public int getX(){		//坐标的set方法和get方法
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public void setX(int x){
		this.x = x;
	}
	
	public void setY(int y){
		this.y = y;
	}
}
