package LearnStrfings;

public class demoFunction {
		/*
		 * 1. with argument without return type:
		 * 
		 * public static void function_name(Arugments){
		 * 		// block of code
		 * }
		 */
	
	public static void fire(String game) {
		System.out.println(game+" fire mode is on...");
	}
	
	
//	2 without argument without return type
	/*
	* public static void function_name(){
		 * 		// block of code
		 * }
		 */
	
	public static void add(){
		 		int a = 10;
		 		int b = 5;
		 		System.out.println(a+b);
		 }
	
	
	
	
//	3. without argument with return type
	/*
	* public static datatype function_name(arguments){
		 * 		// block of code
		 * 		return value
		 * }
		 */
	
	
	public static String con(String fn,String ln) {
		String full_name = fn+" "+ln;
		
		return full_name;
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		//1. function definition
//		  2. function declaration
//		  3. function call
		
		//function_name(arg value)
//		fire("Free Fire..");
////		System.out.println("Hello");
//		fire("Pubg");
		
		
//		add();
//		add();
//		add();
		
		
		System.out.println(con("Praveen","Kumar"));
		String n = con("Dhanush","Saran");
		System.out.println(n);
	}

}
