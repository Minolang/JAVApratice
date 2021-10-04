package day3;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a: ");
		int a = sc.nextInt();
		System.out.print("b: ");
		int b = sc.nextInt();
		System.out.print("c: ");
		int c = sc.nextInt();
		System.out.print("d: ");
		int d = sc.nextInt();
		
		
		int m = ((a>b && a>c && a>d) ? a : (b>c && b>d )? b : (c>d ? c : d));
		System.out.println("아무거나: "+ m);
		
		
		
		
		
		
		
		
	}

}
