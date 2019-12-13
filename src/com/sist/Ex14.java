package com.sist;

import java.util.Scanner;

/*
 * [문제] Ex10 예제를 switch ~ case 문으로
 * 		 바꾸어서 화면에 출력해 보세요.
 */

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*** 메뉴를 선택하세요. ***");
		System.out.println("1. Pizza");
		System.out.println("2. 돈까스");
		System.out.println("3. 제육볶음");
		System.out.println("4. 김치찌개");
		System.out.println("5. 짜장면");
		System.out.print("위 메뉴 중 하나를 선택하세요. : ");
		
		int menu = sc.nextInt(); 
		
		switch(menu) {
			case 1 :
				System.out.println("Pizza 선택");
			case 2 :
				System.out.println("돈까스 선택");
				break;
			case 3 :
				System.out.println("제육볶음 선택");
				break;
			case 4 :
				System.out.println("김치찌개 선택");
				break;
			case 5 :
				System.out.println("짜장면 선택");
				break;
			default :
				System.out.println("식사 안 하실 건가요?");
		}
		
		if(1 <= menu && menu <= 5) {
			System.out.println("맛있게 드세요.");
		} else {
			System.out.println("메뉴를 다시 골라주세요. : ");
			menu = sc.nextInt();
		}
		
		if(menu > 5 || menu < 1) {
			System.out.println("더 이상 물어보지 않을게요. 편안히 쉬세요.");
		}
		
		sc.close();
	}

}
