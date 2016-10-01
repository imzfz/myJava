package platform;

public class MyInteger {
	public static void main(String[] args){
		MyInteger n1 = new MyInteger();
		MyInteger n2 = new MyInteger();
		n1.setValue(5);
		n2.setValue(6);
		System.out.println("n1 is even？" + n1.isEven());
		System.out.println("n1 is odd? " + n1.isOdd());
		System.out.println("n1 is even? " + n2.isEven());
		System.out.println("n1 is odd? " + n2.isOdd());
	}
	
		private int value;
		
		public MyInteger(){
			
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}
		
		public boolean isEven(){
			int value = this.value;
			boolean t = false;
			if(value%2==0)
				t=true;
			return t;
		}
		
		public boolean isOdd(){
			int value = this.value;
			boolean t = false;
			if(value%2 != 0)
				t = true;
			return t;
		}
		
}
