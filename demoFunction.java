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
	
	public static  void add(){
		 		int a = 10;
		 		int b = 5;
		 		System.out.println(a+b);
		 }
	
	
	
	
//	3. without argument with return type
	/*
	* public static datatype function_name(){
		 * 		// block of code
		 * 		return value
		 * }
		 */
	
	
	public static String con(String fn,String ln) {
		String full_name = fn+" "+ln;
		
		return full_name;
	}
	
//	4. with argument with return type
	/*
	* public static datatype function_name(Arguments){
		 * 		// block of code
		 * 		return value
		 * }
		 */
	
	public static String find_number(int a) {
		if (a%2 == 0) {
			return "User Value is Even Number";
		}
		else {
			return "User Value is Odd Number";
		}
	}
	
	
	//Recursive function
	//1.factorial
	public static int fact(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		else {
			return n*fact(n-1);
		}	
	}
	 
	/*
	 * n = 5
	 * return 5*fact(4)  --> 5*
	 * return 4*fact(3)  --> 5*4* --> 20*
	 * return 3*fact(2)  --> 20*3* --> 60*
	 * return 2*fact(1)  --> 60*2* --> 120*
	 * return 120*1 ==> 120
	 */
		
	
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
		
		
//		System.out.println(con("Praveen","Kumar"));
//		String n = con("Dhanush","Saran");
//		System.out.println(n);
		
		
//		System.out.println(find_number(5));
//		String ans = find_number(8);
//		System.out.println(ans);
		
		
		System.out.println(fact(5));
		
	}

}
