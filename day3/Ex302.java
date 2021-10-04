package day3;

public class Ex302 {

	public static void main(String[] args) {
		int num = 7; // 0111
		// (1) num이 홀수 (2) num이 7, 이 둘중 하나만 만족하는지?
		
		System.out.println((num%2!=0) ^ (num==7));
		
		int num2 = 5; // 0101
		System.out.println(num ^ num2);   // 0010
		
		int num3 = 5;
		   	num3 = -3;
		   	
		System.out.println(num3);  //질문
		
		
		
		

	}

}
