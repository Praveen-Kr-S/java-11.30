package java_intro;

public class Learnjava {
	public static void main(String[] args) {
//		System.out.println("Hello Praveen");
		
//		Syntax of Variable
//		datatype Variable_Name = data;
		
		String name = "Dhanush";
		int AGE = 30;
		String City = "Salem";
		String full_name = "Dhanush Saran";
		int mark1 = 96;
		
//		System.out.println(name);
//		System.out.println(AGE);
//		System.out.println(City);
//		System.out.println("full_name :"+full_name);
//		System.out.println(mark1);
		
		/*
		 gb,mb,kb,byte,bit -> 1byte=8bit
		 
		 
		 */
		
//		Data type
		System.out.println(false);
		System.out.println("Character :"+'r');
		//integral -> byte,short,int,long
		byte n1=127;
		System.out.println(n1);
		//floating ->float,double
		System.out.println(121.3456f);
		double d1 = 67.12345678998;
		System.out.println(d1);
		
		/*Find range of data-types
		 * 
		 * -2^n-1 = (2^n-1)-1
		 * n = bit size that datatype
		 * byte = 8bit
		 * -2^7 = (2^7)-1
		 * -128=(128)-1
		 * -128=127
		 * 
		 */
		
		
//		Type Casting
//		1->Windening -> lowest to highest
		byte a = 125;
		System.out.println(a);
		short b = a;
		System.out.println(b);
//		2->Narrowing
		short c = 130;
		System.out.println(c);
		byte d = (byte) c;
		System.out.println(d);
		
		
//		Arithmetic Operator
//		+,-,*,/,%->get the remainder if division
		
		a = 5;
		b = 2;
		System.out.println("Addition:"+(a+b));
		System.out.println("Subtract:"+(a-b));
		System.out.println("Multple:"+(a*b));
		System.out.println("Division:"+(a/b));
		System.out.println("Modulues:"+(a%b));
		
//		Task-1 : Find average 3 number
		
		int num1=20;
		int num2=30;
		int num3=40;
		int total = num1+num2+num3;
		System.out.println("Total :"+total);
		float avg = total/3;
		System.out.println("Average :"+avg);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
