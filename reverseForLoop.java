package day3Assignment;
import java.util.*;

public class reverseForLoop {
	public static void reverseNum(int num) {
		int reverse =0;
		int rem=0;
		for(;num!=0;num=num/10) {
			 rem = num%10;
			 reverse = reverse*10+rem;
		}
			 System.out.println(reverse);
			
			
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number the be reversed:");
		int num = sc.nextInt();
		reverseNum(num);
		
		

	}

}
