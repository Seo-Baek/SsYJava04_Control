package com.sist;

/*
 * [문제1] Ex02 문제를 처리하는데 거짓인 경우에는
 * 		  "불합격" 이라는 문자열을 출력하도록 프로그램을 수정해 보세요.
 * 
 * [문제2] 키보드로 숫자를 입력받아서 입력받은 숫자가
 * 		   홀수인지 짝수인지 판별하세요.
 */

public class Ex04_Problem {

	public static void main(String[] args) {
		
		//[문제1]
		//1. 점수를 입력 받자.
		int score = Integer.parseInt(args[0]);
		
		//2. 합격인가요?
		if(score >= 60) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
		
		
		//[문제2]
		//1. 숫자를 입력받자.
		int num = Integer.parseInt(args[1]);
		
		//2. 홀수인가요?
		if(num % 2 != 0) {
			System.out.println("홀수입니다.");
		} else {
			System.out.println("짝수입니다.");
		}
		
	}

}
