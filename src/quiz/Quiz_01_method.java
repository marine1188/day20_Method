package quiz;

public class Quiz_01_method {
	public static void main(String[] args) {
		// 사칙연산 함수 + , - ,  (리턴 타입 없는 형태)  * , /  (리턴 타입 있는 형태)//풀어보기 
		
		System.out.println(abs(-9));
		int su = abs(5);
		System.out.println(su);
	}
	
	public static int abs(int x) {
		if( x < 0 ) {
			x = -x;
			return x;
		}
		else return x; 
	}
	
//	public static void abs(int x) {
//		if( x < 0 ) x = -x;
//		System.out.println("절대값 : " + x);
//	}
}
