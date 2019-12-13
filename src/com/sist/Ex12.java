package com.sist;

import java.util.Scanner;

/*
 * [문제] 성적처리(이름, 국어, 영어, 수학, 자바 점수 입력) 시
 * 		 Scanner 클래스를 이용하여 키보드로 입력받고,
 * 		 총점, 평균, 학점을 화면에 출력해 보세요.
 */

public class Ex12 {

	public static void main(String[] args) {
		
		//1. 키보드로 데이터를 받자.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		
		System.out.print("국어 점수를 입력하세요 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 점수를 입력하세요 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 점수를 입력하세요 : ");
		int mat = sc.nextInt();
		
		System.out.print("자바 점수를 입력하세요 : ");
		int java = sc.nextInt();
		
		//2. 총점을 구하자.
		int tot = kor + eng + mat + java;
			
		//3. 평균을 구하자.
		float avg = tot / 4.0f;
		
		//4. 학점을 구하자.
		String grade = null; 
		if(avg >= 90) {
			if(avg >= 95) {
				grade = "A+학점";
			} else{
				grade = "A학점";
			}
		} else if (avg >= 80) {
			grade = "B학점";
		} else if (avg >= 70) {
			grade = "C학점";
		} else if (avg >= 60) {
			grade = "D학점";
		} else {
			grade = "F학점";
		}
		
		//5. 성적을 화면에 출력해보자.
		System.out.println("이  름 : " + name);
		System.out.println("국어점수 : " + kor + "점");
		System.out.println("영학점수 : " + eng + "점");
		System.out.println("수학점수 : " + mat + "점");
		System.out.println("자바점수 : " + java + "점");
		System.out.println("총  점 : " + tot + "점");
		System.out.printf("평  균 : %.2f점\n", avg);
		System.out.println("학  점 : " + grade);
		
		sc.close();
	
		

	}

}
