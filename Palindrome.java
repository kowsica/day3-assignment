package day3Assignment;
import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		int rem,reverse = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = sc.nextInt();
		int temp=num;
		for(;num!=0;num=num/10) {
			 rem = num%10;
			 reverse = reverse*10+rem;
		}
		System.out.println(reverse);
		
		if(reverse==temp) 
			System.out.println(temp+" "+"number is  palindrome");
		
		else 
			System.out.println(temp+" "+"number is not a palindrome");
		}
	}

	


