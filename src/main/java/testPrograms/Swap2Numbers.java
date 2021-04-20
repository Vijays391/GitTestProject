package testPrograms;

import java.util.Scanner;

public class Swap2Numbers {

	
	
	public static void main(String[] args) {
		
		
		int a,b;
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter two Numbers a and b");
		a=in.nextInt();
		b=in.nextInt();
		
		System.out.println("Before swapping value of a is "+a+" Before swapping value of b is "+b);
		
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swapping value of a is "+a+" After swapping value of b is "+b);
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
