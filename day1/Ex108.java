package day1;

public class Ex108 {

	public static void main(String[] args) {
		byte b =127;
		System.out.println(b);
		b++;     // 127 --> -128 (Overflow)
		System.out.println(b);
		b--;     // -128 --> 127 (Underflow)
		System.out.println(b);
		
	}

}
