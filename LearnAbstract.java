package Learn_oops;
/*
 * Abstraction using interface
 * 
 * interface name{
 * 	unimplemented function
 * 	void function_name();
 * }
 */

interface A{
	void fun1();
}

class B implements A{

	@Override
	public void fun1() {
		System.out.println("Hello Java..");
		System.out.println("Hello Python..");
	}
	
}



// multiple inheritance
interface camera{
	void photo();
}
interface music_player{
	void play_music();
}
class phone implements camera,music_player{
	public void play_music() {
		System.out.println("Enjoy with playful musics....");	
	}
	public void photo() {
		System.out.println("Take your memory with good pic...");	
	}
	void call() {
		System.out.println("Talk with your connections.....");
	}	
}

// Hybrid inheritance
interface AA{
	void fun1();
}
interface BB extends AA{
	void fun2();
}
interface CC extends AA{
	void fun3();
}
class DD implements CC,BB{
	public void fun1() {
		System.out.println("Hello Java");	
	}
	public void fun2() {
		System.out.println("Hello Python");	
	}
	public void fun3() {
		System.out.println("Hello C++");	
	}
	void fun4() {
		System.out.println("Hello C");
	}
}



// encapsulation
/*
 * access specifier and access modifier
 * private ==> data access only own class
 * protected ==> data access both own class and their sub-class
 * public ==> data access any one
 * default ==> same to public
 */

class ac_details{
	public String name = "Vasanth.G";
//	protected long ac_no = 987658764;
	private String ac_no = null;
	private int pin = 0;
	void set_pin(int p) {
		this.pin = p;
	}
	void set_ac_no(String n) {
		this.ac_no = n;
	}
	
	String get_ac_no() {
		return this.ac_no;
	}
	
}

class gpay extends ac_details{
	void fun1(){
		System.out.println(this.name);
//		System.out.println(this.pin);
	}
}


public class LearnAbstract {

	public static void main(String[] args) {
		//encapsulation
		ac_details ac = new ac_details();
//		System.out.println(ac.name);
//		System.out.println(ac.pin);
//		System.out.println(ac.ac_no);
//		ac.set_pin(1234);
//		ac.set_ac_no("98765432345");
//		System.out.println(ac.get_ac_no());
		
		gpay g = new gpay();
		g.fun1();
		
		B obj = new B();
//		obj.fun1();
		
//		phone p = new phone();
//		p.call();
//		p.play_music();
//		p.photo();
		
//		DD obj1 = new DD();
//		obj1.fun1();
//		obj1.fun2();
//		obj1.fun3();
//		obj1.fun4();
		
		
		
		
		
		
		
		
	}

}

