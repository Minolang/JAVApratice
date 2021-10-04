package day1;//고급

public class Ex105 {

	public static void main(String[] args) {
		byte b1 = 100;
		byte b2 = 10;
		//byte b3 = b1 +b2;  //ERR.이해
		byte b3 = (byte)(b1+b2);
		char ch = 'A' +32;   // 자동으로 형변환O
		char ch2 = 'A';
		char ch3 =(char)(ch+ch2);
		//char ch3 = ch2 + 32; ERR//자동으로 형변환X
		System.out.println(ch3);
		System.out.println(b3);
		
		

	}

}
