package day3Assignment;
import java.util.Scanner;

public class VowelsSwitch {



	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Alphebet");
		char ch = sc.next().charAt(0);
		switch (ch) {
		case 'a':
			System.out.println("The entered alphabet is a vowel");
			break;
		case 'e':
			System.out.println("The entered alphabet is a vowel");
			break;
		case 'i':
			System.out.println("The entered alphabet is a vowel");
			break;
		case 'o':
			System.out.println("The entered alphabet is a vowel");
			break;
		case 'u':
			System.out.println("The entered alphabet is a vowel");
			break;
			default:
				System.out.println("The entered alphabet is a consonant");
			
			
		
		}
		
		
		
		

	}

}
