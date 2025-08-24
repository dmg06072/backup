package Ch01;

import java.util.Scanner;

class C06Simple {
	// 속성
	
	// 기능
	public int sum(int n1, int n2) {
		System.out.println("sum1(int n1, int n2)");
		return n1 + n2;
	}
	public int sum(int n1, int n2, int n3) {
		System.out.println("sum2(int n1, int n2, int n3)");
		return n1 + n2+ n3;
	}
	public int sum(int n1, int n2, int n3, int n4) {
		System.out.println("sum3(int n1, int n2, int n3, int n4)");
		return n1 + n2 + n3 + n4;
	}
	
}
// 오버로딩 : 같은 이름의 메서드를 **매개변수(parameter)**의 개수 또는 타입만 다르게 하여 여러 개 정의하는 것
// 메서드 이름을 재사용함으로써 코드의 가독성과 유지보수성 향상
public class C06MethodOverloadingMain {

	public static void main(String[] args) {
		C06Simple obj = new C06Simple();
		obj.sum(10, 20);
		obj.sum(10, 20, 30);
		obj.sum(10, 20, 30, 40);

	}

}
