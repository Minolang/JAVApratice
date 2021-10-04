package day1;

//(이해) char는 사실상 '2바이트 정수형'
public class Ex104 {

	public static void main(String[] args) {
		//char ch = "문"; //ERR. 따옴표(")는 문자열 / 홀따옴표(')한문자.
//		char ch = 65+2; //'A';
//		System.out.println("ch : "+ch); // ch : A
		char ch = 'D';
		System.out.println(ch>=65 && ch<=90);
		
		//연습1. char변수에 저장되어 있는 문자가 '소문자'인지?
		
		//연습2. char변수에 저장되어 있는 문자가 '대문자' 라가고 가정할 때,
		//  	그에 해당하는 '소문자'를 출력?
		//       (ex) ch가 'F'일 때 ---> 출력: f
		ch = 'S'; //83
		System.out.println(ch>='a' & ch<='z');
		char ch2 = (char) (ch + 32);  //이해안됨
		System.out.println( ch2 );
		
		
		
	}

}
