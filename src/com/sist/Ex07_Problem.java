package com.sist;

/*
 * 학생 성적 처리
 * 이름, 국어, 영어, 수학, 자바 점수를 입력받아서
 * 총점, 평균, 학점을 출력해보자. 
 */

public class Ex07_Problem {

	public static void main(String[] args) {
		
		//1. 키보드로 이름, 국어, 영어, 수학, 자바 점수를 입력받자.
		String name = args[0];
		int kor = Integer.parseInt(args[1]);
		int eng = Integer.parseInt(args[2]);
		int mat = Integer.parseInt(args[3]);
		int java = Integer.parseInt(args[4]);
		
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
