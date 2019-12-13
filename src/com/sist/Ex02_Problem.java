package com.sist;

/*
 * [문제] 키보드로 점수를 입력받아서 해당 점수가 
 * 		 60점 이상이면 "합격" 이라는 문자열을
 * 		 화면에 출력해 보세요
 */

public class Ex02_Problem {

	public static void main(String[] args) {
		
		//키보드로 점수를 입력을 받자!
		int score  = Integer.parseInt(args[0]);
		
		
		if(score >= 60) 
			System.out.println("합격입니다.");	
			// 한줄이면 중괄호를 생략해도 된다.
			// 그러나 관례적으로 헷갈릴 수 있기 때문에 {}를 해준다!
		
	}

}
