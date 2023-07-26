package day3Assignment;
import java.util.*;

public class OperatorProblem {
	public static void operatorProbExp(int a,int b,int c) {
		float out1 =a+b*c ;
		System.out.println(out1);
		float out2=c+a/b;
		System.out.println(out2);
		float out3=a%b+c;
		System.out.println(out3);
		float out4 =a*b+c;
		System.out.println(out4);
		System.out.println();
		 float result[] = {out1, out2,out3,out4};
		 for(int i=0;i<result.length;i++) {
			 System.out.print(result[i]+" ");
		 }
	 float max = result[0];
		for(int i=1;i<result.length;i++) {
			if(result[i]<max) {
				max = result[i];
				
			}
				System.out.println(result[i]);
				
			}
		float min = result[0];
		for(int i=1;i<result.length;i++) {
			if(result[i]>max) {
				min = result[i];
				
			}
				System.out.println(result[i]);
		}
		}
		
		
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the first number");
		int a = sc.nextInt();
		System.out.println("Enter the second number");
		int b = sc.nextInt();
		System.out.println("Enter the third number");
		int c = sc.nextInt();
		
		operatorProbExp(a,b,c);
		

	}

}
