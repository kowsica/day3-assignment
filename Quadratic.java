package day3Assignment;
import java.util.*;
public class Quadratic {
		 
	public static void calculateRoots(int a, int b, int c) {
		
		
		
		int d = b * b - 4 * a * c;  
		double sqrtval = Math.sqrt(d);  
		if (d > 0)   
		{  
		System.out.println("The roots of the equation are real and different. \n");  
		System.out.println((double)(-b + sqrtval) / (2 * a) + "\n"+ (double)(-b - sqrtval) / (2 * a));  
		}  
		else if (d == 0)   
		{  
		System.out.println("The roots of the equation are real and same. \n");  
		System.out.println(-(double)b / (2 * a) + "\n"+ -(double)b / (2 * a));  
		}  
		
		else   
		{  
		System.out.println("The roots of the equation are complex and different. \n");  
		System.out.println(-(double)b / (2 * a) + " + i"+ sqrtval + "\n"+ -(double)b / (2 * a)+ " - i" + sqrtval);  
		}
		
		}  
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the input values");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		calculateRoots( a,  b, c);
	}

}
