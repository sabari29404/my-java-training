package exception;

import java.util.Scanner;

class demo1{
	void fun1() {
		System.out.println("connection2 established");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the numerator");
		int a =scan.nextInt();
		System.out.println("Enter the denominator");
		int b=scan.nextInt();
		int c=a/b;
		System.out.println(c);
		System.out.println("connection 2 established");
	}
}

class demo2{
	void fun2() {
		try {
		demo1 d1=new demo1();
		d1.fun1();
	}
		catch(Exception e) {
			System.out.println("problem resolved");
		}
		}
		
}

class demo3{
	void fun3() {
		//try {
		demo2 d2=new demo2();
		d2.fun2();
		//}
}
}

class demo4{
	void fun4() {
		demo3 d3=new demo3();
		d3.fun3();
	}
}
public class example2 {
	public static void main(String[] args) {
		System.out.println("connection1 established");
		demo4 d4=new demo4();
		d4.fun4();
		System.out.println("connection1 terminated");
	}
}

if(board[0][0]=='X'&&board[0][2]=='X'&&board[0][4]=='X'||
board[0][0]=='X'&&board[2][0]=='X'&&board[4][0]=='X'||
board[4][0]=='X'&&board[4][2]=='X'&&board[4][4]=='X'||
board[4][4]=='X'&&board[2][4]=='X'&&board[0][4]=='X'||
board[0][2]=='X'&&board[2][2]=='X'&&board[4][2]=='X'||
board[2][0]=='X'&&board[2][2]=='X'&&board[2][4]=='X'||
board[4][4]=='X'&&board[2][4]=='X'&&board[0][4]=='X'||
board[0][0]=='X'&&board[2][2]=='X'&&board[4][4]=='X'||
board[0][4]=='X'&&board[2][2]=='X'&&board[4][0]=='X'
) {
System.out.println("X won");
loop=false;
}
else if(board[0][0]=='0'&&board[0][2]=='0'&&board[0][4]=='0'||
	board[0][0]=='0'&&board[2][0]=='0'&&board[4][0]=='0'||
	board[4][0]=='0'&&board[4][2]=='0'&&board[4][4]=='0'||
	board[4][4]=='0'&&board[2][4]=='0'&&board[0][4]=='0'||
	board[0][2]=='0'&&board[2][2]=='0'&&board[4][2]=='0'||
	board[2][0]=='0'&&board[2][2]=='0'&&board[2][4]=='0'||
	board[4][4]=='0'&&board[2][4]=='0'&&board[0][4]=='0'||
	board[0][0]=='0'&&board[2][2]=='0'&&board[4][4]=='0'||
	board[0][4]=='0'&&board[2][2]=='0'&&board[4][0]=='0'
	) {
System.out.println("0 won");
loop=false;
}
else {
System.out.println("Match draw!");
loop=false;
}
