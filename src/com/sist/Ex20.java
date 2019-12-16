package com.sist;

import java.util.Scanner;

// 키보드로 입력 받은 수까지의 홀수의 합과 짝수의 합을 구해 보자.

public class Ex20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		
		int max = sc.nextInt();
		int num = 1, sum1 = 0, sum2 = 0;
		
		while(num <= max) {
			if(num % 2 == 1) {
				sum1 += num;
			} else {
				sum2 += num;
			}
			num++;
		}
		
		System.out.printf("1~%d까지의 홀수의 합 ==> %d\n", max, sum1);
		System.out.printf("1~%d까지의 홀수의 합 ==> %d\n", max, sum2);
		
		sc.close();
		
		System.out.println("");
		
		//반복문에서 무한루프를 돌리는 방법
		
		int su = 1;
		
		while(true) {			//반복문에서 무한루프
			if(su > 10) {
				break;
			}
			System.out.println("su ==> " + su);
			su++;
		}
		
	}//class

}//main
