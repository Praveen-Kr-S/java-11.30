package flow_of_control;

public class Demo_Patterns {
	
	public static void main(String[] args) {
//		Nested for loop
//		square pattern
		int n = 5;
		for(int i=1; i<=n;i++) {
			for(int j = 1; j<=n;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		System.out.println("+++++++++++++++");
		
		n = 5;
		for(int i=1; i<=n;i++) {
			for(int j = 1; j<=n;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println("+++++++++++++++");
//		Half Pyramid / inc
		
		n = 5;
		for(int i=1; i<=n;i++) {
			for(int j = 1; j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		/*
		 * i=1-> t
		 * j=1  => j<=i => 1<=1
		 * j=2  => j<=i => 2<=1 --> False
		 * 
		 * i=2 -> t
		 * j=1  => j<=i => 1<=2
		 * j=2  => j<=i => 2<=2
		 * j=3  =>  3<=2 -> false
		 * 
		 * 
		 * i = 3 -> t
		 * j=1  => j<=i => 1<=3
		 * j=2  => j<=i => 2<=3
		 * j=3  =>  3<=3
		 * j=4  =>  4<=3 -> false
		 * 
		 * i = 4 -> t
		 * j=1  => j<=i => 1<=4
		 * j=2  => j<=i => 2<=4
		 * j=3  =>  3<=4
		 * j=4  =>  4<=4
		 * j=5  =>  5<=4 -> false
		 * 
		 * i = 5 -> t
		 * j=1  => j<=i => 1<=5
		 * j=2  => j<=i => 2<=5
		 * j=3  =>  3<=5
		 * j=4  =>  4<=5
		 * j=5  =>  5<=5 
		 * j=6  =>  6<=5 -> false
		 * 
		 * i=6 -> false
		 */
		
		System.out.println("+++++++++++++++");
//		Inverted Half Pyramid
		
		n = 5;
		for(int i=1; i<=n;i++) {
			for(int j = 5; j>=i;j--) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println("+++++++++++++++");
		//full pyramid
		
		n = 5;
		for(int i=1; i<=n;i++) {
			//dec for space
			for(int j = 5; j>=i;j--) {
				System.out.print(" "+" ");
			}
			//inc 1st half pyramid
			for(int j = 1; j<=i-1;j++) {
				System.out.print("*"+" ");
			}
			//inc 2nd half pyramid
			for(int j = 1; j<=i;j++) {
				System.out.print("*"+" ");
			}
			
			System.out.println();
			
		}
		System.out.println("+++++++++++++++");
		
//		hollow square

		n = 5;
		for(int i=1; i<=n;i++) {
			for(int j = 1; j<=n;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println("+++++++++++++++");
		n = 5;
		for(int i=1; i<=n;i++) {
			for(int j = 1; j<=n;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("+++++++++++++++");
		n = 5;
		for(int i=1; i<=n;i++) {
			for(int j = 1; j<=n;j++) {
				if(i==1 || i==5 || j==1 ||j==5)
					System.out.print(j+" ");
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
		
		System.out.println("+++++++++++++++");
		n = 5;
		for(int i=1; i<=n;i++) {
			for(int j = 1; j<=n;j++) {
				if(i==3 || j==3)
					System.out.print(j+" ");
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
		
		
		System.out.println("+++++++++++++++");
//		pattern with ascii
		
		char b = 65;
		n = 5;
		for(int i=1; i<=n;i++) {
			for(int j = 1; j<=i;j++) {
				System.out.print(b+" ");
				b+=1;
			}
			System.out.println();
		}
		
		System.out.println("+++++++++++++++");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
