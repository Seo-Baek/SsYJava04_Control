package com.sist;

import java.util.Scanner;

public class scoreWithAgainInfinityTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean score = true;
		
		String name = null;
		
		System.out.print("이름을 입력하세요 : ");
		while(score == true) {
			name = sc.next();
			int length = name.length();
			if(2> length) {
				System.out.print("다시 입력해주세요 : ");
				continue;
				
			} else {
				score = false;
			}
		}
		
		score = true;
		
		int kor = 0, eng = 0, mat = 0, java =0 ;
		
		System.out.print("국어점수를 입력하세요 : ");
		while(score == true) {
			kor = sc.nextInt();
			if(kor < 0) {
				System.out.print("다시 입력해주세요 : ");
				continue;
				
			} else {
				score = false;
			}
		}
		
		score = true;
		
		System.out.print("영어점수를 입력하세요 : ");
		while(score == true) {
			eng = sc.nextInt();
			if(eng < 0) {
				System.out.print("다시 입력해주세요 : ");
				continue;
				
			} else {
				score = false;
			}
		}
		
		score = true;
		
		System.out.print("수학점수를 입력하세요 : ");
		while(score == true) {
			mat = sc.nextInt();
			if(mat < 0) {
				System.out.print("다시 입력해주세요 : ");
				continue;
				
			} else {
				score = false;
			}
		}
		
		score = true;
		
		System.out.print("자바점수를 입력하세요 : ");
		while(score == true) {
			java = sc.nextInt();
			if(java < 0) {
				System.out.print("다시 입력해주세요 : ");
				continue;
				
			} else {
				score = false;
			}
		}
		
		score = true;
		
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
		
		
	
		sc. close();
	}
	
	

}
