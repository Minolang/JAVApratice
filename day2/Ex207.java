package day2;

import java.util.Scanner;

//C = 5 / 9 x ( F - 32 )   <=== 공식 섭씨
//- 정수값을 입력받아서 (화씨온도)
//- 입력받은 화씨온도를 섭씨온도로 변환.
//[실행결과] 화씨온도를 입력하세요 : 100 (엔터)
//	   화씨 100도 --> 섭씨 37.777778도


public class Ex207 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//스캐너 객체 생성 문장
		System.out.print("화씨온도를 입력하세요 : ");
		int f =	sc.nextInt();
		
		
		
		float c = 5.0f / 9.0f * ( f - 32 );
		System.out.println(f-32);   // 어디서 0이나오는지
		System.out.println(5/9);	// 어디서 0이나오는지
		System.out.println("화씨"+f+"도 --> 섭씨 "+c+"도");
		
		
		
		
	
		

	}

}
