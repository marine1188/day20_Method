package ex02.method;

public class MethodTest {
// 자동으로 만들어짐
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = methodEx(1.2,5.7);
		System.out.println(result);
	}

	private static int methodEx(double d1, double d2) {
		//더블 타입에 합을 잡고
		double hap = d1+d2;
		//리턴하는 함수의 자료형 우선 순위 높음
		return (int)hap;//리턴 타입과 함수 타입(자료형)이 다르면 에러다.
	}

}
