package demo;

public class Vehicle {
	private float speed;
	
	public Vehicle(){
		
	}
	
	public Vehicle(float speed){
		if(speed<=240)
		this.speed = speed;
	}
	
	public float getSpeed(){
		return speed;
	}
	
	public void setSpeed(float speed){
		if(speed<=240)
		this.speed = speed;
	}
	
	public float speedUp(float up){
		if(speed<=240)
		speed += up;
		return speed;
	}
	
	public float speedDown(float down){
		speed -= down;
		return speed;
	}
	

}
