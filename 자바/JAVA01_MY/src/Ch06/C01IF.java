package Ch06;

import java.util.Scanner;

public class C01IF {

	public static void main(String[] args) {
		// 단순 IF
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("나이 : ");
//		int age = sc.nextInt();
//		if(age >= 8 && age < 20)
//			System.out.println("학교에 다닙니다.");;
//			
//		System.out.println("첫번째 IF 코드 블럭 종료..");
//		
//		if(age<8 || age >= 20)
//			System.out.println("학교에 다니지 않습니다.");
//		System.out.println("두번째 IF 코드 블럭 종료..");
//		System.out.println("프로그램을 종료합니다.");
//		
//		sc.close();
		
		// IF-ELSE
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("나이 : ");
//		int age = sc.nextInt();
//		if(age >= 8)
//			System.out.println("학교에 다닙니다.");
//		else
//			System.out.println("학교에 다니지 않습니다.");
//		
//		System.out.println("프로그램을 종료합니다.");
//		sc.close();
		
		// 문제 1.
		// 정수 한개값을 입력받아 3의 배수이면 해당 수를 출력하세요
		// 3의 배수이면서 5의 배수라면 출력 -
		// 순서도 그리기
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수 1개 입력: ");
//		int a = sc.nextInt();
//		if(a % 3 == 0 && a % 5 == 0)
//			System.out.println("3과 5의 공배수 입니다.");
//		else
//			System.out.println("3의 배수 또는 5의 배수가 아닙니다.");
//		sc.close();
		
		// 문제 2.
		// 두개의 정수를 입력 받아 큰 수 출력
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수 2개 입력 : ");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		if(a != b)
//			System.out.print("두 수 중 큰 수는 : ");
//			System.out.println((a > b) ? a : b);
		
//		sc.close();
		
		// 문제 3.
		// 세 개의 정수를 입력받아 큰 수 출력
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수 3개 입력 : ");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		int d;
//		
//		if(a > b)
//			d = (a > c) ? a : c;
//		else 
//			d = (b > c) ? b : c;
//		
//		System.out.println("가장 큰 수는: " + d);
//		
//		sc.close();
		
		// 문제 4. 
		// 
		
		// 문제 5.
		
		// IF - ELSE IF - ELSE
		// 과목 1,2,3,4 중 하나라도 40점 미만이면 불합격
		// 과목평균이 100점만점 기준으로 60점 미만이면 불합격
		// 아니면 합격
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("점수 입력 하소 ");
//		int 과목1 = sc.nextInt();
//		int 과목2 = sc.nextInt();
//		int 과목3 = sc.nextInt();
//		int 과목4 = sc.nextInt();
//		double 평균 = (double)(과목1 + 과목2 + 과목3 + 과목4) / 4;
		
//		if(과목1 < 40)
//			System.out.println("불합격");
//		else if(과목2 < 40)
//			System.out.println("불합격");
//		else if(과목3 < 40)
//			System.out.println("불합격");
//		else if(과목4 < 40)
//			System.out.println("불합격");
//		else if(평균 < 60)
//			System.out.println("불합격");
//		
//		else
//			System.out.println("합격");
//		
//		sc.close();
		
//		if(과목1 >= 40 && 과목2 >= 40 && 과목3 >= 40 && 과목4 >= 40 && 평균 < 60)
//			System.out.println("불합격");
//		else
//			System.out.println("합격");
		
		// 문제
		// 시험 점수를 입력받아
		// 90 ~ 100점은 A,
		// 80 ~ 89점은 B,
		// 70 ~ 79점은 C,
		// 60 ~ 69점은 D,
		// 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("점수 입력해라");
//		int a = sc.nextInt();
//		
//		if(a >= 90)
//			System.out.println("A");
//		else if(a >= 80 && a < 90)
//			System.out.println("B");
//		else if(a >= 70 && a < 80)
//			System.out.println("C");
//		else if(a >= 60 && a < 70)
//			System.out.println("D");
//		else
//			System.out.println("F");
//		sc.close();
		
		// 문제
		// 나이별로 요금을 부과하는 else if문을 만드세요
		// 8세 미만 : 요금은 1000원
		// 14세 미만 : 요금은 2000원
		// 20세 미만 : 요금은 2500원
		// 20세 이상 : 요금은 3000원
		
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 살? ");
		int age = sc.nextInt();
		
		if(age < 8)
			System.out.println("1000원");
		else if(age >= 8 && age <14)
			System.out.println("2000원");
		else if(age >= 14 && age < 20)
			System.out.println("2500원");
		else
			System.out.println("3000원");
	}

}
