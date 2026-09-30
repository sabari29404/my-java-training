package javaproblems;

public class SymmetricInt {
	public static void main(String[] args) {
		
		int num=102;
		int temp=0;
		int symNum=0;
		
		/*while(num>0) {
			temp=num%10;
			num=num/10;
			if(num>0)
				symNum=(symNum+temp)*10;
			else
				symNum=symNum+temp;
		}*/
		
		while(num>0) {
			temp=num%10;
			symNum=(symNum*10)+temp;
			num=num/10;
		}
		
		System.out.println(symNum);

	}

}
