package ex02.method;

public class ArrayMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = methodTest(1,2);
		System.out.println(result);
		
		int[]arrResult = methodEx();
		for (int i = 0; i < arrResult.length; i++) {
			System.out.print(arrResult[i]+" ");
		}
	}
	
	public static int[] methodEx() {
		int[]arr = {1,2,3,4,5,6,7,8};
		
		return arr; // 여러개의 데이터전달은 배열 ,객체 로 리턴한다
	}
	
	public static int methodTest(int x,int y) {
		return x+y;
	}

}
