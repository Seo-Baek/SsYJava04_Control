package com.sist;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		// Scanner 클래스를 이용하는 방법
		// System.in : 표준입력장치(키보드)
		Scanner sc = new Scanner(System.in);
		
		// 키보드로 입력을 받을 때는 사용자가 알 수 있도록 멘트를 작성하는 것이 좋다. 
		
		System.out.println("*** 메뉴를 선택하세요. ***");
		System.out.println("1. Pizza");
		System.out.println("2. 돈까스");
		System.out.println("3. 제육볶음");
		System.out.println("4. 김치찌개");
		System.out.println("5. 짜장면");
		System.out.print("위 메뉴 중 하나를 선택하세요. : ");
		
		int menu = sc.nextInt(); 
		// nextInt() : 키보드로 숫자 값을 입력받을 때 사용하는 메소드 - 반환타입(int)
		// next() 	 : 키보드로 문자열을 입력받을 때 사용하는 메소드 - 반환타입(String)
		
		if(menu == 1) {
			System.out.println("Pizza 선택");
		} else if(menu == 2) {
			System.out.println("돈까스 선택");
		} else if(menu == 3) {
			System.out.println("제육볶음 선택");
		}else if(menu == 4) {
			System.out.println("김치찌개 선택");
		}else if(menu == 5) {
			System.out.println("짜장면 선택");
		} else  {
			System.out.println("선택하신 메뉴는 없는 메뉴입니다.");
		}
		
		System.out.println("이름을 입력하세요. : ");
		String name = sc.next();
		System.out.println(name + "님 환영합니다.");
		
		// 키보드로 입력을 받으면 해당 장치를 닫아주는 것이 좋다.
		sc.close(); 
		
	}

}
