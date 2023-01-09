package casting;

public class Son extends Father {
	public void Bick() {// sub class
		System.out.println("Son property bick");
	}
	public static void main(String[] args) {
		
		
	
		Son y =(Son) new Father();
		y.car();
		y.Home();
		y.Bick();
		
	}
	

	

}
