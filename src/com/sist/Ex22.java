package com.sist;

/*
 *3. for 반복문
 *	  - 기준 변수의 값을 이용하여 반복하는 명령문.
 *	  - 일정 횟수에 기반한 반복을 구현할 떄 효율적으로 사용함.
 *		형식)
 *			for(초기식; 조건식; 증감식) {
 *				반복실행문;
 *			}
 *
 *[for문 실행 순서]
 *1. 초기식 : 처음에 한 번만 실행됨(기준변수 선언)
 *2. 조건식 : 조건이 참이면 반복, 거짓이면 탈출(exit)
 *3. 실행문 : 반복대상인 반복 실행문이 실행.
 *4. 증감식 : 기준변수를 대상으로 증가(++) 또는 감소(--)
 */

public class Ex22 {

	public static void main(String[] args) {
		
		//for문으로 1~10까지를 화면에 출력해 보자
		for(int su = 1; su <= 10; su++) {
			System.out.println("su ==> " + su);
		}
		System.out.println();
		
		
		
	}

}
