package demo;

public class Fan {

		public final int SLOW = 1,MEDIUM = 2,FAST = 3;
		private int speed = SLOW;
		private boolean on = false;
		private double radius = 5;
		private String color = "blue"; 
		
		public void setSpeed(int speed){
			this.speed = speed;
		}
		public void setOn(boolean on){
			this.on = on;
		}
		public void setRadius(double radius){
			this.radius = radius;
		}
		public void setColor(String color){
			this.color = color;
		}
		public int getSpeed(){
			return speed;
		}
		public boolean getOn(){
			return on;
		}
		public double getRadius(){
			return radius;
		}
		public String getColor(){
			return color;
		}
		
		public String toString(){
			if(on){
				return "该风扇的速度为:" + getSpeed() + ";" + "颜色是:" + getColor() + ";" + "半径是" + getRadius() + ";";
			}
			else{
				return "fan is off.该风扇的颜色是" + getColor() + ";" + "半径是:" + getRadius();
			}
		}
		
		public static void main(String[] args){
			Fan f = new Fan();
			Fan f1 = new Fan();
			f.setOn(true);
			f.setColor("yellow");
			f.setSpeed(3);
			f.setRadius(10);
			
			f1.setOn(false);
			f1.setColor("blue");
			f1.setRadius(5);
			
			System.out.println(f.toString());
			System.out.println(f1.toString());
//			System.out.println("该风扇的速度为:" + f.getSpeed() + ";" + "颜色是:" + f.getColor() + ";" + "半径是" + f.getRadius() + ";");
//			System.out.println("fan is off" + f.getSpeed() + ";" + "颜色是:" + f.getColor() + ";" + "半径是" + f.getRadius() + ";");
		}

}
