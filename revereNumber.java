package day3Assignment;
import java.util.*;

public class revereNumber {
	public static void reverseNum(int num) {
		int reverse =0;
		while(num!=0) {
			int remainder =num%10;
			reverse = reverse*10+ remainder;
			num = num/10; 	
			
		}
		System.out.println("The reversed number is:"+reverse);
		
		
		
		
	}

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number t be reversed:");
	int num = sc.nextInt();
	reverseNum(num);
	

	}

}
