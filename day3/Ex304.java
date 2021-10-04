package day3;//복습
//Ex304(참고) : S.C.E "Short-circuit Evaluation
public class Ex304 {

	public static void main(String[] args) {
		int num = 5;
		if(num>30 || ++num==6) {   
			System.out.println("num : " + num);
		}
		if(num<3 && ++num==6) {
			System.out.println("2)num : "+  num);

		}
		System.out.println("3) num : " +num);
	}

}
