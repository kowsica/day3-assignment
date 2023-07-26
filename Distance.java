package day3Assignment;
import java.util.*;
public class Distance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the coordinates of x and y");
		int x = sc.nextInt();
		int y= sc.nextInt();
		
		double distance =Math.sqrt(x*x +y*y);
	System.out.println(distance);
			
		}
		

	}


