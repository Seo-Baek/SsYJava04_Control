package practise;

import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {	//무한반복
			System.out.print("이름 입력 : ");
			String name = sc.next();
			
			System.out.print("국어 점수 입력 : ");
			int kor = sc.nextInt();
			
			System.out.print("영어 점수 입력 : ");
			int eng = sc.nextInt();
			
			System.out.print("수학 점수 입력 : ");
			int mat = sc.nextInt();
			
			System.out.println("");
			
			//2. 총점을 구하자.
			int tot = kor + eng + mat;
			
			//3. 평균을 구하자.
			float avg = tot / 3.0f; 
			
			//4. 학점을 구하자.
			
			/*
			 * sysout으로 평균까지 출력한 다음, if문으로 학점구하고
			 * sysout으로 다시 빼주면 변수를 선언하지 않아도 될텐데!
			 */
			
			String grade = null; // 값이 없는 상태
			if(avg >= 90) {
				grade = "A학점";
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
			System.out.println("총  점 : " + tot + "점");
			System.out.printf("평  균 : %.2f점\n", avg);
			System.out.println("학  점 : " + grade);
			System.out.println("");
			
		
			System.out.print("계속 할까요 ? (Y:계속 / N:종료) : ");
			String code = sc.next();
			
			//equalsIgnoreCase() : 대소문자를 구분하지 않도록 해주는 메소드.
			if(code.equalsIgnoreCase("N")) {
				break;
			}
			
		}//while문 end
		
		System.out.println("수고 하셨습니다.");
		
		sc.close();
		
	}

}
