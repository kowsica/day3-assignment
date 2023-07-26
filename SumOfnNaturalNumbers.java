package day3Assignment;
import java.util.Scanner;

public class SumOfnNaturalNumbers {
	public static void naturalNumbers(int num) {
		int sum=0;
		while(num!=0) {
			for(int i =1;i<=num;i++) {
			
			sum= i+sum ;
			}
			System.out.println(sum);
			break;
			
			
			
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number till which sum is to be calculated:");
		int num = sc.nextInt();
		naturalNumbers(num);


	}

}
