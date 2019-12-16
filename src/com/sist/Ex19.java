package com.sist;

public class Ex19 {

	public static void main(String[] args) {
		
		// while 반복문으로 1 ~ 10까지의 합을 출력해 보자.
		int su = 1;		  // 반복문에서 초기식
		int sum = 0;		  // 반복문에서 합을 누적하는 변수
		
		while(su <= 10) { // 반복문에서 조건식
			sum += su;		// 누적변수를 선언할 때는 무조건 초기값이 들어가야한다!
			su++;
			
		}
		
		System.out.println("sum ==> " + sum);
		
		//[문제] 1~100까지의 홀수의 합과 짝수의 합을 구하세요.
		
		int a = 1;						// 반복문에서 초기식
		int sum1 = 0, sum2 = 0;					
		// 반복문에서 홀수의 합, 짝수의 합 변수 선언 및 초기화
		// 누적변수 : 누적변수는 반드시 초기화, 초기화 시 값은 0으로 설정
		
		while(a <= 100) {				// 반복문에서 조건식
			if(a % 2 != 0) {
				//참인 경우에는 홀수의 합을 누적
				sum1 += a;	
				// a++;
			}else {
				//거짓인 경우에는 짝수의 합을 누적
				sum2 += a;
				// a++;
			}
			
			a++; // 코드가 중복되는 것을 방지해준다. 반복문에서 증감식
		}
		
		System.out.println("1~100까지의 홀수의 합 : " + sum1);
		System.out.println("1~100까지의 짝수의 합 : " + sum2);
		
		
	}

}

		