package LearnOops;

//constructor
// this -> keyword

class Car{
	
	String brand = null;
	String model = null;
	String color = null;
	String fuel = null;
	int price = 0;
	
	public Car(String b,String m,String c,String f,int p) {
		
		this.brand = b;
		this.model = m;
		this.color = c;
		this.fuel = f;
		this.price = p;
		
		System.out.println("Car Brand : "+this.brand);
		System.out.println("Car Model : "+this.model);
		System.out.println("Car Color : "+this.color);
		System.out.println("Car Fuel : "+this.fuel);
		System.out.println("Car Price : "+this.price);
		System.out.println("+++++++++++++++++++++++");
		}

}


//this
class Add{
	int a = 100;
	int b = 500;
	public Add() {
//		int a = 1;
		int b = 50;
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("global b : "+this.b);
		
		
	}
}

public class DemoConstructor {

	public static void main(String[] args) {
		
//		Car c1 = new Car("TATA","Nexon","White","Petrol",1500000);
//		Car c2 = new Car("Hyundai","i20","Res","Disel",1200000);
		
		Add a1 = new Add();	

	}

}
