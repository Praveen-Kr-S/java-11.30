package Learn_oops;

class Mobile{
	// set attributes(variables) and functions
	String brand = null;
	String model = null;
	String color = null;
	int battery = 0;
	int price = 0;
	
	public void button() {
		System.out.println("Button help's to screen on/off");
	}
}


public class LaearnOops {
	
	public static void main(String[] args) {
		
		//Syntax of object
		// classname variable = new classname();
		Mobile m1 = new Mobile();
		m1.brand = "Samsung";
		m1.model = "S26";
		m1.color = "White";
		m1.battery = 6000;
		m1.price = 120000;
		System.out.println(m1.brand);
		System.out.println(m1.model);
		System.out.println(m1.color);
		System.out.println(m1.battery+" mAh");
		System.out.println("RS : "+m1.price);
		m1.button();
		
		System.out.println("------------------------");
		Mobile m2 = new Mobile();
		m2.brand = "Apple";
		m2.model = "16 Pro";
		m2.color = "Black";
		m2.battery = 5000;
		m2.price = 135000;
		System.out.println(m2.brand);
		System.out.println(m2.model);
		System.out.println(m2.color);
		System.out.println(m2.battery+" mAh");
		System.out.println("RS : "+m2.price);
		
		
		
	}
}
