package com.sist;

/*
 * 반복문
 * 1. while 반복문
 * 	  - 조건식을 비교하여 참인 경우 계속하여 실행문을 반복하고,
 * 		조건식이 거짓인 경우에는 반복문을 빠져나가는 문장
 * 	  - 반복문에는 반드시 초기식, 조건식, 증감식이 따라다닌다.
 * 		형식)
 * 			while(조건식) {
 * 				반복실행문;
 * 			}
 * 
 * 2. do~while 반복문
 *   - 먼저 반복실행문을 실행하고 조건을 체크함.
 *   - 한 번 이상 반복실행문이 수행되어야 하는 경우에 사용한다.
 *     형식)
 *     		do {
 * 				반복실행문;
 * 			} while(조건식);
 */

public class Ex18 {

	public static void main(String[] args) {
		
		System.out.println("num ==> " + 1);
		System.out.println("num ==> " + 2);
		System.out.println("num ==> " + 3);
		System.out.println("num ==> " + 4);
		System.out.println("num ==> " + 5);
		System.out.println("num ==> " + 6);
		System.out.println("num ==> " + 7);
		System.out.println("num ==> " + 8);
		System.out.println("num ==> " + 9);
		System.out.println("num ==> " + 10);
		
		System.out.println("");
		
		//while 반복문을 이용하여 1~10까지 출력해 보자.
		
		int su = 1;				//반복문에서 초기식
		
		while(su <= 10) {		//반복문에서 조건식
			System.out.println("su ==> " + su);
			su++;				//반복문에서 증감식
		}
	}

}
