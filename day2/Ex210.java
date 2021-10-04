package day2;

import java.util.Scanner;

public class Ex210 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a : ");
		int a = sc.nextInt();
		System.out.print("b : ");
		int b = sc.nextInt();
		System.out.print("c : ");
		int c = sc.nextInt();
		
		int max = (a>b && a>c) ? a : (b>c ? b : c);
		System.out.println("max : " + max);
		
		int min = (c>b && c>a) ? c : (b<a ? a : b);//이해 x
		
		
		System.out.println("min : " + min);
		
		
		
		
		
		
		
		
		
		

	}

}
