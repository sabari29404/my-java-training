package javaproblems;

import java.util.Scanner;

public class MatrixAdd {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[][] a= {{2,7,3},{4,5,6},{7,8,9}};
		int[][] b= {{5,8,1},{6,7,3},{4,5,9}};
		int[][] c=new int[3][3];
		
		System.out.println("Enter the operation to perform (+, -, /, *): ");
		char choice=scan.nextLine().charAt(0);
		//System.out.println(choice);
		
		switch(choice) {
		case '+':{
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<a[0].length;j++) {
					c[i][j]=a[i][j]+b[i][j];
				}
			}
			break;
		}
		case '-':{
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<a[0].length;j++) {
					c[i][j]=a[i][j]-b[i][j];
				}
			}
			break;
		}	
		case '*':{
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<a[0].length;j++) {
					c[i][j]=a[i][j]*b[i][j];
				}
			}
			break;
		}
		case '/':{
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<a[0].length;j++) {
					c[i][j]=a[i][j]/b[i][j];
				}
			}
			break;
		}
		default: 
			System.out.println("invalid syntax");
			break;
		}
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}

}
