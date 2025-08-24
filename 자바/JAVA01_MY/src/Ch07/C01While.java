package Ch07;

import java.util.Scanner;

public class C01While {

	public static void main(String[] args) {
		// 00 기본 문법
//		while(조건식) {
//			조건식이 true인 동안 실행되는 종속 문장
//		}

		// 01 HELLO WORLD 10회 출력
		// 탈출용 변수 선언
		// 탈출용 조건식 세우기
		// 탈출 연산식
//		int a = 0;
//		while(a < 10) {
//			System.out.println(a+ "HELLO WORLD");
//			a++;
//		}

		// 02 HELLO WORLD N회 출력(N은 키보드로 받는 정수값, N>0)
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//
//		if (n <= 0) {
//			System.out.printf("n은 0보다 커야합니다\n");
//			System.exit(-1);
//		}
//		int a = 0;
//		while (a < n) {
//			System.out.println(a + "HELLO WORLD");
//			a++;
//		}

		// 03 1부터 10까지 누적합 구하기
//		int a = 1;
//		int sum = 0;
//		while (a <= 10) {
//			System.out.println("a : " + a);
//			sum += a;
//			a++;
//		}
//		System.out.printf("%d 부터 %d 까지의 합 : %d\n", 1,10,sum);

		// 04 1부터 N까지 구적합 구하기
//		Scanner sc = new Scanner(System.in);
//		int b = sc.nextInt();
//		int a = 1;
//		int sum = 0;
//		while(a <= b) {
//			sum += a;
//			a++;
//		}
//		System.out.printf("1부터 %d까지의 합은 %d ", a, sum);

		// 05 N부터 M까지 누적합 구하기(N<M)
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		
//		if(n>=m) {				// m이 n보다 클 때 위치? 바꿔주기
//			int tmp = n;
//			n = m;
//			m = tmp;
//		}
//		int sum = 0;
//		while(n <= m) {
//			sum += n;
//			n++;
//		}
//		System.out.printf("%d부터 %d까지의 합은 %d", n, m, sum);

		// 06 n부터 m까지 수중(n<m)에 짝수의 합, 홀수의 합을 각각 구해서 출력
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		int a = 0; // 홀수 합
//		int b = 0; // 짝수 합
//
//		while (n <= m) {
//			if (n % 2 == 0) {
//				b += n;
//			} else {
//				a += n;
//			}
//			n++;
//		}
//		System.out.printf("짝수의 합 = %d\n", b);
//		System.out.printf("홀수의 합 = %d\n", a);

		// 07 n단 구구단 출력(2 <=n <=9)
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int a = 1;
//		while(a <= 9) {
//			System.out.printf("%d * %d = %d\n", n, a, n * a);
//			a++;
//		}
		
		

	}

}

