package day3Assignment;
import java.util.*;

public class SpringSeason {
	 		public static void springMonth(int days, int month) {
	 			if(days>=20 && days<31  && month>=3 && month<=6)
	 				System.out.println("true");
	 			else
	 				System.out.println("False");
	 				
	 			
	 		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the date and month");
		  int days = sc.nextInt();
		  int month = sc.nextInt();
		springMonth(days,month);
		
	}

}
