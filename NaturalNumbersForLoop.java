package day3Assignment;
import java.util.*;

public class NaturalNumbersForLoop {
	public static void reverseNum(int num) {
		int sum =0;
		for(int i =1;i<=num;i++) {
			sum =sum+i;
		}
		System.out.println(sum);
		
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number till which sum is to be calculated: ");
		int num = sc.nextInt();
		reverseNum(num);
		

	}

}
