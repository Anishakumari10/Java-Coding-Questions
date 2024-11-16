package packageA;

public class BMW extends car{
	
	public void speed() {
		int b = super.a;
		super.speed();
		System.out.println("CAR BMW".concat(Integer.toString(b)));
	
	}
	public static void main(String args[]) {
		
		car c = new BMW();
		c.speed();
	}
 
}
