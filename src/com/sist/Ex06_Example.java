package com.sist;

public class Ex06_Example {

	public static void main(String[] args) {

		int score = Integer.parseInt(args[0]);
		
		if(score >= 90) {
			System.out.println("90 이상의 숫자입니다.");
		} else if (score >= 80) {
			System.out.println("80 ~ 89 사이의 숫자입니다.");
		} else if (score >= 70) {
			System.out.println("70 ~ 79 사이의 숫자입니다.");
		} else if (score >= 60) {
			System.out.println("60 ~ 69 사이의 숫자입니다.");
		} else {
			System.out.println("60 미만의 숫자입니다.");
		} 
				
	}

}
