package Strings_learn;

/*
 * compile time polymorphism
 * 
 * we need single class with same named multiple function with different arguments
 * 
 * different arguments method --> 1. different count arguments , 2. different data-type 
 * 
 */


class Demo {
	void fun1(int a, int b, int c) {
		System.out.println("3 Arguments Mulitiple value : "+(a*b*c));
	}
	void fun1(int a, int b) {
		System.out.println("2 Arguments add value : "+(a+b));
	}
	void fun1(int a) {
		if(a>0) {
			System.out.println(a+" is Positive Number");
		}
		else {
			System.out.println(a+" is Negative Number");
		}
	}
	void fun1(String a, String b) {
		System.out.println("Full Name : "+a+" "+b);
	}
	void fun1(int a, String b) {
		System.out.println(a+" "+b);
	}		
	
}


/*
 * Run time polymorphism/method overriding
 * 
 * we need multiple classes with same named functions
 * they class are in inherited
 */
class notepad{
	void program() {
		System.out.println("We Run the Java Code Without Any Suggestion..");
	}
}
class eclipse extends notepad{
	void program() {
		super.program();
		System.out.println("Excecute the Java Code With Project Structure.");
	}
}
class vscode extends eclipse{
	void program() {
		super.program();
		System.out.println("Excecute the Java Code With AI Suggestions.");
	}
}


// final keyword


class LearnFinal{
	final int a = 100;
	void demo(){
		System.out.println(a);
		System.out.println("Hello java...");
	}
}

class BB extends LearnFinal{
	void demo() {
		System.out.println("Hello Python...");
	}
}

// Abstraction
abstract class zoho_app{
	abstract void soure();
}

class vendor extends zoho_app{

	void soure() {
		System.out.println("App Name : Zoho Chat");
		System.out.println("App Type : Chating..");
	}
	
}



public class DemoPolymorphism {

	public static void main(String[] args) {

//		Demo d = new Demo();
//		d.fun1("PRAVEEN","KUMAR");
//		d.fun1(20,10);
//		d.fun1(-6);
//		d.fun1(1, 2, 3);
//		d.fun1(1, "Dhanush");
		
		
//		vscode vs = new vscode();
//		vs.program();
		
//		BB b = new BB();
//		b.demo();
		
		
		vendor v = new vendor();
		v.soure();
		
		
		
		
		
		
	}

}
