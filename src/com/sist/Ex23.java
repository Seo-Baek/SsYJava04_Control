package com.sist;

import java.util.Scanner;

/*
 * [문제1] 1~100까지의 홀수의 합과 짝수의 합을
 * 		  for 반복문을 이용하여 화면에 보여주세요.
 * [문제2] 키보드로 입력받은 수까지의 홀수의 합과 
 * 		  짝수의 합을 for 반복문을 이용하여 화면에 보여주세요.
 */

public class Ex23 {

	public static void main(String[] args) {
		
		//[문제1]
		int sum1 = 0, sum2 = 0;
		for(int su = 1; su <= 100; su++) { 
			//초기식에 sum1, sum2도 선언은 할 수 있으나 포문 바깥으로 나가면 사라지게된다.
			//이렇게 지역적으로 메소드 내에서만 선언되고 사라지는 변수를 지역변수라고 한다!
			if(su % 2 == 1) {
				sum1 += su;
			} else {
				sum2 += su;
			}
		}
		System.out.println("1~100까지의 홀수의 합 ==> " + sum1);
		System.out.println("1~100까지의 짝수의 합 ==> " + sum2);
		
		System.out.println();
		
	    Scanner sc = new Scanner(System.in);
	    System.out.print("숫자를 입력해 주세요 : ");
	    int score = sc.nextInt();
		int odd = 0, even = 0;
		for(int su = 1; su <= score; su++) {
			if(su % 2 == 1) {
				odd += su;
			} else {
				even += su;
			}
		}
		System.out.printf("1~%d까지의 홀수의 합 ==> %d\n" , score, odd);
		System.out.printf("1~%d까지의 짝수의 합 ==> %d", score, even);
		
		sc.close();
	}

}
