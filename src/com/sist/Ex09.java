package com.sist;

import javax.swing.JOptionPane;

/*
 * 키보드로 데이터를 입력받는 방법(4가지)
 * 1. main(String args[])를 이용하는 방법
 * 2. JOptionPane 클래스를 이용하는 방법(GUI 방식) - 13장
 * 3. Scanner 클래스를 이용하는 방법
 * 4. 파일 입출력을 이용하는 방법
 */

public class Ex09 {
	public static void main(String[] args) {
		
		//1. GUI 방식으로 데이터를 키보드로부터 입력을 받자.
		String name = JOptionPane.showInputDialog("이름을 입력하세요.");
		int kor = Integer.parseInt(JOptionPane.showInputDialog("국어점수 입력"));
		int eng = Integer.parseInt(JOptionPane.showInputDialog("영어점수 입력"));
		int mat = Integer.parseInt(JOptionPane.showInputDialog("수학점수 입력"));
		int java = Integer.parseInt(JOptionPane.showInputDialog("자바점수 입력"));
		
		//2. 총점을 구하자.
		int tot = kor + eng + mat + java;
		
		//3. 평균을 구하자.
		float avg = tot / 4.0f;
		
		//4. 학점을 구하자.
		
		/*
		 * sysout으로 평균까지 출력한 다음, if문으로 학점구하고
		 * sysout으로 다시 빼주면 변수를 선언하지 않아도 될텐데!
		 */
		
		String grade = null; // 값이 없는 상태
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
	
				
		
	}
}
