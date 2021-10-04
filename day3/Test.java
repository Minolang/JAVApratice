package day3;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("가 : ");
		int a = sc.nextInt();
		System.out.print("나 : ");
		int b = sc.nextInt();
		System.out.print("다 : ");
		int c = sc.nextInt();
		
		int max = (b>a && b>c) ? b : (c>a ? c : a);
		
		System.out.println("최고값 : " + max);
	
		
	}

}
