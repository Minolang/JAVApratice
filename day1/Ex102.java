package day1;
//[기억] 모든 연산은 "동일한 데이터타입 간에만 가능"
//   (ex) byte b = 3; int i = b; // 자동 형 변환이 일어나고 있음 (이해)★
// 자동 형 변환: byte>short>int>long> float> double
// 강제 형 변환: 변화하고자 하는 값 (데이터) 앞에, (데이터타입)
public class Ex102 {

	public static void main(String[] args) {
		byte b = 3; //byte 타입의 변수를 b를 선언하고 3을 대입.
		short s = b;
		int i = s;
		long lo = i;
		float f = lo;
		double d = f;
		System.out.println(d); //3  정답  3.0 (틀림)
		
		int num = (int)lo * 3; //강제 형 변환*
		System.out.println("num : " + num);  // num : 9 ????
		
		

	}

}
