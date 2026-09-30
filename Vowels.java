package javaproblems;

public class Vowels {
	public static void main(String[] args) {
	
		char let='2';
		
		if(let>='a'&&let<='z') {
			switch(let) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println("It is Vowels");
				break;
				default:
				{
					System.out.println("It is consonant!");
					break;
				}
			}
			
		}
		else {
			System.out.println("Invalid syntax");
		}

	}

}
