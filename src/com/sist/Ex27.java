package com.sist;

/*
 * 2. continue 명령어
 * 	 - 반복문에서만 사용 가능한 명령어
 * 	 - 반복문을 탈출하는 것이 아니라, 다음 증감식으로 가는 명령어
 */

public class Ex27 {

	public static void main(String[] args) {
		
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if(i % 2 == 1) {
				continue;
			}
			
			sum += i;
			
		}//외부 for
		System.out.println("sum ==> " + sum);
		
	}//main

}//class
