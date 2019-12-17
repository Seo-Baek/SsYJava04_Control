package practise;

import java.util.Scanner;

public class NaeMam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("총 학생수 : ");
		int student = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <= student; i++) {
			System.out.print("학생의 성적을 입력해주세요 : ");
			int score = sc.nextInt();
			sum += score;
		}
		
		int avg = sum / student;
		System.out.println(student + "명 학생의 점수 총 합 : " + sum);
		System.out.println(student + "명 학생의 점수 평균 : " + avg);
		
	}

}
