package Learn_array;

import java.util.Scanner;

public class SdArray {

	public static void main(String[] args) {
		
//		Single dimensional array
		
		int ar[] = new int[5];
		
		ar[0] = 10;
		ar[1] = 20;
		ar[2] = 30;
		ar[3] = 40;
		ar[4] = 50;
//		System.out.println(ar[0]);
//		System.out.println(ar[1]);
//		System.out.println(ar[2]);
//		System.out.println(ar[3]);
//		System.out.println(ar[4]);
		
//		System.out.println(ar.length);
//		for(int i = 0; i < ar.length;i++) {
//			System.out.println(ar[i]);
//		}
		
		
//		array create by c method	
		int ar1[] = {2,3,4,56,24,5,67};
//		System.out.println(ar1.length);
//		for(int i = 0; i<ar1.length;i++) {
//			System.out.println(ar1[i]);
//		}
		
		
//		input methods
		int ar2[] = new int[5];
		
//		Scanner scan = new Scanner(System.in);
//		for(int i = 0; i<ar2.length;i++) {
//			System.out.print("Enter the "+i+" index data :");
//			ar2[i] = scan.nextInt();
//		}
		
//		for(int i = 0; i<ar2.length;i++) {
//			System.out.println(ar2[i]);
//		}
		
//		enhanced for loop
//		for(int v:ar2) {
//			System.out.println(v);
//		}
		
		
		
//		multi-dimensional array
//		2D array (rows and column)
		
		int arr[][] = new int[2][3];
		
		arr[0][0]=10;
		arr[0][1]=20;
		arr[0][2]=30;
		arr[1][0]=40;
		arr[1][1]=50;
		arr[1][2]=20;
//		System.out.println(arr[1][1]);
//		for(int i = 0;i<2;i++) {
//			for(int j = 0;j<3;j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		
//		int arr1[][] = {{1,2,3},{4,5,6},{6,7,8}};
//		
//		for(int i = 0;i<3;i++) {
//			for(int j = 0;j<3;j++) {
//				System.out.print(arr1[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Array No of Rows :");
		int row = scan.nextInt();
		System.out.print("Enter the Array No of Column :");
		int col = scan.nextInt();
		int arr2[][] = new int[row][col];
		
		for(int i = 0; i<row;i++) {
			for(int j = 0; j<col;j++) {
				System.out.println("row "+i+" column "+j+" value :");
				arr2[i][j] = scan.nextInt();
			}
		}
		
		
		for(int i = 0;i<row;i++) {
		for(int j = 0;j<col;j++) {
			System.out.print(arr2[i][j]+" ");
		}
		System.out.println();
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
