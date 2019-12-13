package com.sist;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
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
		
		int tot = kor + eng + mat + java;
		float avg = tot / 4.0f;
		
		String grade = null;
		
		//학점을 구할 때 switch~case 문을 이용하자
		
		switch (((int)avg / 10)) {
			case 10 :
			case 9 :
				grade = "A학점";
				break;			
			case 8 :
				grade = "B학점";
				break;
			case 7 :
				grade = "C학점";
				break;
			case 6 :
				grade = "D학점";
				break;
			default :
				grade = "F학점";
				break;
		}
		
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
