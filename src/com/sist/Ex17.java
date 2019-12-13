package com.sist;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("직급을 입력하세요. : ");
		String position = sc.next();
		
		switch(position) {		//char형도 ''를 사용하여 작성이 가능하다.
			case "사장" :
				System.out.println("사장 급여는 1,000만원입니다.");
				break;
			case "전무" :
				System.out.println("전무 급여는 700만원입니다.");
				break;
			case "부장" :
				System.out.println("부장 급여는 500만원입니다.");
				break;
			case "차장" :
				System.out.println("차장 급여는 400만원입니다.");
				break;
			case "과장" :
				System.out.println("과장 급여는 350만원입니다.");
				break;
			case "대리" :
				System.out.println("대리 급여는 300만원입니다.");
				break;
			case "사원" :
				System.out.println("사원 급여는 200만원입니다.");
				break;
		}

		sc.close();
	}

}
