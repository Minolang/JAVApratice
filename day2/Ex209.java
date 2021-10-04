package day2;

// Ex209. 단항연산자 /삼항연산자
public class Ex209 {
	public static void main(String[] args) {
		int num = 5;
			System.out.println(-num);
			System.out.println(num++); //5
			System.out.println(num); //6
			
			int num2 = 3 + 5;  //이항
			
			int num3 = 15;
			char ch = num3%2==0 ? '짝' : '홀'; //삼항연산자  조건식이 트루면 짝쪽 조건식이 폴스면 홀
			System.out.println(ch);
			
			int a = 15;
			int b = 17;
			int max = a<b? a : b ;
			int min = b>a? b : a;
			
			System.out.println("max : " + max);
			System.out.println("min : " + min);
	}

}
