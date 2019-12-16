package com.sist;

/*
 * break 명령어
 * 	  - 현재의 제어문을 빠져나가는 명령어.
 * 	  - 보통 switch~case문과 반복문에서 사용된다.
 * 	  - if문을 감싸는 첫번째 블록에서 빠져나오는 명령어이다.
 */

public class Ex26 {

	public static void main(String[] args) {

		// 반복문에서 break 예제
		for(int i = 1; i <= 100; i ++) {
			if(i > 10) { // 11이 될 때 반복문에서 탈출
				break; // 블럭 탈출
			}
			System.out.println("i ==> " + i);
		}
			System.out.println();
			
			// 합이 100이 되는 순간의 합과 그 때까지의 숫자를 화면에 출력해 보세요.
			int sum = 0, num = 0;
			for(num = 1; ; num++) {		// 조건이 없으니 무한반복 개념
				sum+= num;
				if(sum >= 100) {
					break;
				}
			}
			System.out.println("sum ==> " + sum);
			System.out.println("num ==> " + num);
		}
	}


