package day3Assignment;
import java.util.*;

public class DigitValue {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ones, tens,hundreds,thousands;
		System.out.println("Enter the number either 1 , 10, 100,1000:");
		int num = sc.nextInt();
		if(num == 1)
			ones = num%10;
		if(num==10)
			tens = num%100;
			

	}

}
