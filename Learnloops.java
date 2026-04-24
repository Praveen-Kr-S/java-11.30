package flow_of_control;

import java.util.Scanner;

public class Learnloops {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
//		System.out.print("Enter the Value : ");
//		int a = scan.nextInt();
//		int b = 0; // to store the reverse value
//		int t = a;
////		121  -> 121
//		while(t>0) {
//			int d=t%10; // to get last number in digits
//			b = b*10+d;
//			t = t/10; // remove the last number in digit
//		}
//		
//		if(b == a) {
//			System.out.println(b+" is palindrome number..");
//		}
//		else {
//			System.out.println(b+" is not a palindrome number..");
//		}
		
		/*
		 *  1
		 * while(121 > 0) -> true
		 * d = 121%10 ->12.1 -> d = 1
		 * b = 0*10+1 -> b = 1
		 * t = 121/10 -> 12.1 -> t = 12
		 * 
		 * 2
		 * while(12 > 0) -> true
		 * d = 12%10 ->1.2 -> d = 2
		 * b = 1*10+2 = > b = 12
		 * t = 12/10 => 1.2 => t = 1
		 * 
		 * 
		 * 3
		 * while(1 > 0) -> true
		 * d = 1%10 -> 0.1 -> d = 1
		 * b = 12*10+1 = > b = 121
		 * t = 1/10 => 0.1 => t = 0
		 * 
		 * 4
		 * while(0 > 0) -> false
		 */
		
		
//		Armstrong number
		/*
		 * 153 -> 1+125+27 => 153
		 */
//		System.out.print("Enter the Value : "); //153
//		int a = scan.nextInt();
//		int b = 0; // to store the reverse value
//		int t = a;
////		121  -> 121
//		while(t>0) {
//			int d=t%10; // to get last number in digits
//			b+=Math.pow(d,3);
//			t = t/10; // remove the last number in digit
//		}
//		
//		if(b == a) {
//			System.out.println(b+" is Armstrong number..");
//		}
//		else {
//			System.out.println(b+" is not a Armstrong number..");
//		}
		
		
//		do-while loop
		
		/* 			1
		 * data-type variable = value;
		 * do{
		 * 				2
		 * 		//loop statement;
		 * 			3
		 * 		//inc-dec;
		 * 			4
		 * } while(condition);
		 * 
		 */
		
//		int a = 1;
//		do {
//			System.out.println(a);
//			a++;
//		} while(a<=5);
		
		
//		Jumping & Transfer statement
//		break
//		for(int i = 1; i <=10; i++) {
//			if(i==7) {
//				break;
//			}
//			else {
//				System.out.println(i);
//			}
//		}
		
//		continue
		for(int i = 1; i <=10; i++) {
			if(i==7 || i == 4) {
				continue;
			}
			else {
				System.out.println(i);
			}
		}
		
		
		
		
		
		
				
		
		
		
		
	}
}
