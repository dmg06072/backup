package Ch07;

import java.util.Scanner;

public class C02While {

	public static void main(String[] args) {
		// 2단 - 9단 출력

//		int dan = 2;
//		while(dan <= 9) {
////			System.out.printf("%d\n", dan);
//			int i=1;
//			while(i <= 9) {
//				System.out.printf("%d x %d = %d\n", dan, i, dan*i);
//				i++;
//			}
//		System.out.printf("\n");
//			dan++;
//		}

		// 2단 - 9단(2x9, 2x8, ..., 2x1
//		int dan = 2;
//		while(dan <= 9) {
//			int i=9;
//			while(i > 0) {
//				System.out.printf("%d x %d = %d\n", dan, i, dan*i);
//				i--;
//			}
//		System.out.printf("\n");
//			dan++;
//		}

		// 9단 - 2단
//		int dan = 9;
//		while(dan >= 2) {
//			int i=9;
//			while(i >= 1) {
//				System.out.printf("%d x %d = %d\n", dan, i, dan*i);
//				i--;
//			}
//		System.out.printf("\n");
//			dan--;
//		}

		// 2단 - n단

//		int dan = 2;
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		while(dan <= a) {
//			int i=1;
//			while(i <= 9) {
//				System.out.printf("%d x %d = %d\n", dan, i, dan*i);
//				i++;
//			}
//		System.out.printf("\n");
//			dan++;
//		}

		// n단 - m단
//		Scanner sc = new Scanner(System.in);
//		int dan1 = sc.nextInt();
//		int dan2 = sc.nextInt();
//		
//		if(dan1 >= dan2) {
//			int tmp = dan1;
//			dan1 = dan2;
//			dan2 = tmp;
//		}
//		while (dan1 <= dan2) {
//			int i = 1;
//			while (i <= 9) {
//				System.out.printf("%d x %d = %d\n", dan1, i, dan1 * i);
//				i++;
//			}
//			System.out.printf("\n");
//			dan1++;
//		}

		// 별 찍기(기본높이:4)
		// 반드시 반복을 사용할 것, 반복 시 마다 하나의 *만 찍어낼 것
//		int a = 1;
//		while(a <= 4) {
//			int b = 1;
//			while(b <= 5) {
//				System.out.print("*");
//				b++;
//			}
//			System.out.println();
//			a++;
//		}

		// 높이 입력 받아서 별 찍기
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int a = 1;
//		while(a <= h) {
//			int b = 1;
//			while(b <= 5) {
//				System.out.print("*");
//				b++;
//			}
//			System.out.println();
//			a++;
//		}

		// 높이 4(고정)
		// 직각 삼각형 별 찍기
//		int a = 1;
//		while(a <= 4) {
//			int b = 1;
//			while(b <= a) {
//				System.out.print("*");
//				b++;
//			}
//			System.out.println();
//			a++;
//		}

		// 높이 입력받기
		// 직각 삼각형 별 찍기
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int a = 1;
//		while (a <= h) {
//			int b = 1;
//			while (b <= a) {
//				System.out.print("*");
//				b++;
//			}
//			System.out.println();
//			a++;
//		}

		// 높이 : 4
		// 역삼각형
//		int a = 1;
//		while (a <= 4) {
//			int b = 4;
//			while (b >= a) {
//				System.out.print("*");
//				b--;
//			}
//			System.out.println();
//			a++;
//		}

		// 높이 : h
		// 역삼각형
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int a = 1;
//		while (a <= h) {
//			int b = h;
//			while (b >= a) {
//				System.out.print("*");
//				b--;
//			}
//			System.out.println();
//			a++;
//		}

//		int a = 1;
//		while(a <= 4) {
//			int space = 0;
//			while(space <= 4-a) {
//				System.out.print(" ");
//				space++;
//			}
//			int b = 1;
//			while(b <= a) {
//				System.out.print("*");
//				b++;
//			}
//			System.out.println();
//			a++;
//		}

		// 피라미드
//		int a = 1;
//		while (a <= 4) {
//			int space = 0;
//			while (space <= 4 - a) {
//				System.out.print(" ");
//				space++;
//			}
//			int b = 1;
//			while (b <= 2 * a - 1) {
//				System.out.print("*");
//				b++;
//			}
//			System.out.println();
//			a++;
//		}

		// 피라미드 높이 입력 받기
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int a = 1;
//		while (a <= h) {
//			int space = 0;
//			while (space <= h - a) {
//				System.out.print(" ");
//				space++;
//			}
//			int b = 1;
//			while (b <= 2 * a - 1) {
//				System.out.print("*");
//				b++;
//			}
//			System.out.println();
//			a++;
//		}

		// 역 피라미드
//		int a = 1;
//		while (a <= 4) {
//			int space = 0;
//			while (space <= a) {
//				System.out.print(" ");
//				space++;
//			}
//			int b = 1;
//			while (b <= ((4 - a +1)*2) - 1) {
//				System.out.print("*");
//				b++;
//			}
//			System.out.println();
//			a++;
//		}

		// 역 피라미드 높이 입력 받기
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int a = 1;
//		while (a <= h) {
//			int space = 0;
//			while (space <= a) {
//				System.out.print(" ");
//				space++;
//			}
//			int b = 1;
//			while (b <= ((h - a +1)*2) - 1) {
//				System.out.print("*");
//				b++;
//			}
//			System.out.println();
//			a++;
//		}

		// 마름모
//		int a = 0;
//		while (a <= 6) {
//			if (a <= 3) {
//				int space = 0;
//				while (space <= 3 - a) {
//					System.out.print(" ");
//					space++;
//				}
//				int s = 0;
//				while (s <= 2 * a) {
//					System.out.print("*");
//					s++;
//				}
//			} else {
//				int space = 0;
//				while (space <= a - 3) {
//					System.out.print(" ");
//					space++;
//				}
//				int s = 0;
//				while (s <= 12 - 2 * a) {
//					System.out.print("*");
//					s++;
//				}
//			}
//			System.out.println();
//			a++;
//		}

		// 마름모 높이 입력
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		while(h%2==0) {
			System.out.println("높이값 다시 입력 : ");
			h = sc.nextInt();
		}
		int a = 0;
		while (a <= h) {
			if (a <= h/2) {
				int space = 0;
				while (space <= h/2 - a) {
					System.out.print(" ");
					space++;
				}
				int s = 0;
				while (s <= 2 * a) {
					System.out.print("*");
					s++;
				}
			} else {
				int space = 0;
				while (space <= a-(h/2)) {
					System.out.print(" ");
					space++;
				}
				int s = 0;
				while (s <=  ((h-1) * 2) -2*a) {
					System.out.print("*");
					s++;
				}
			}
			System.out.println();
			a++;
		}
	}

}
