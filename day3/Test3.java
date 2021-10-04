package day3;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a:");
		int a = sc.nextInt();
		System.out.print("b:");
		int b = sc.nextInt();
		System.out.print("c:");
		int c = sc.nextInt();
		
		
		int m = (a>c && a>b ? a : (b>c ? b : c));
		
		System.out.println("max :" + m);
		
			

	}

}
