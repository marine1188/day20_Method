package ex03.method;
//- instance method : 객체 생성하고 사용해야함 (메모리에 할당이 되어야,... )

class A
	{
		int x,y;
		
		public void setData(int xx,int yy) {
			System.out.println(xx+","+yy);
		}
	}//A class end


public class InstanceMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A(); //객체생성,메모리에 할당, 생성자함수 자동 호출
		
		a.setData(20, 50);
		InstanceMethod im = new InstanceMethod();
		im.showName();
		
		}
	public void showName() {
		System.out.println("yuna");
	}

}
