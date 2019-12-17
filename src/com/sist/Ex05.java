package com.sist;

/*
 * 다중 if~else문 - 조건문
 * 형식)
 * 		if(조건식1) {
 * 			조건식1이 참인 경우 실행문;
 * 		} else if(조건식2) {
 * 			조건식 1은 거짓이고 조건식2가 참인 경우 실행문;
 * 		} else if(조건식3) {
 * 			조건식 1과 2가 모두 거짓이고, 조건식3은 참인 경우 실행문;
 * 		} else {
 * 			조건식1, 조건식2, 조건식3이 모두 거짓인 경우 실행문;
 * 		}
 */
public class Ex05 {

	public static void main(String[] args) {
 
		int num = 5;
		
		if(num == 1) {
			System.out.println("입력된 숫자는 1입니다.");
		} else if (num == 2) {
			System.out.println("입력된 숫자는 2입니다.");
		} else if (num == 3) {
			System.out.println("입력된 숫자는 3입니다.");
		} else {
			System.out.println("입력된 숫자는 4 이상의 숫자입니다.");
		}
	}

}
