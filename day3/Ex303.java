package day3;

public class Ex303 {

	public static void main(String[] args) {
		int a = 10;
		System.out.println(5<a  && a<15); //true  (틀림)
		System.out.println((5<a && a<15) && (a%2== 0));  //ture (틀림)
		a =4;
		System.out.println((5<a && a<15) && (a%2==0));  //false
		System.out.println((5<a && a<15) || (a%2==0));  //true
		
		
		//이하 고급(비트연산자)
		int b = 0b1111;
		int c = 0b0101;
		System.out.println(b|c);  //  1111  15 (틀림)
		System.out.println(b&c);  // 0101  5   (틀림)
		System.out.println(b^c);  // 1010  10  (틀림)
	
		System.out.println(0b01110011);


	}
}