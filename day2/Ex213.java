package day2;
//			1) 변수 num과 num2를 선언
//			2) num에 10이라는 값을대입
//			3) num이 "5보다 크고 15보다 작은지"를 출력 
//			4) num2에 num%3의 값을 대입
//			5) num+num2가 "짝수이고 0보다 큰지" 를출력
public class Ex213 {
	public static void main(String[] args) {
		int num = 10;
		System.out.println(num>5 && num<15);
		int num2;
		num2 = num%3;
		System.out.println((num+num2)%2==0 && (num+num2)>0); //틀림 복습 소괄호
		
		
		

	}

}
