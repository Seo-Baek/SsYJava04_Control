package com.sist;

/*
 * if~else문 - 조건문
 * 형식)
 * 		if(조건식) {
 * 			조건식이 참인 경우 실행문;
 * 		} else {
 * 			조건식이 거짓인 경우 실행문;
 * 		}
 */

public class Ex03 {

	public static void main(String[] args) {

		System.out.println("1. 아침에 일찍 일어납니다.");
		System.out.println("2. 세수를 합니다.");
		String bf = "밥";
		
		if(bf.equals("밥")) {
			System.out.println("3. 밥을 먹습니다.");
		} else {
			System.out.println("3. 빵을 먹습니다.");
		}
		
		System.out.println("4. 국기 수업을 받으러 학원에 갑니다.");
		
		System.out.println("");
		
		char gender = 'M';
		
		if(gender == 'F') {
			System.out.println("당신은 여성이군요~~~");
		} else {
			System.out.println("당신은 남성이구만요~~~");
		}
	}

}
