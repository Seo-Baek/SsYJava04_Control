package com.sist;

/*
 * [문제] Ex08 예제를 switch~case 문으로 
 * 		 바꾸어서 화면에 출력해 보세요.
 */

public class Ex15 {

	public static void main(String[] args) {
		
		int num = (int)(Math.random() * 6) + 1;
		
		switch(num){
			case 1 :
				System.out.println("1이 나왔습니다.");
				break;
			case 2 :
				System.out.println("2가 나왔습니다.");
				break;
			case 3 :
				System.out.println("3이 나왔습니다.");
				break;
			case 4 :
				System.out.println("4가 나왔습니다.");
				break;
			case 5 :
				System.out.println("5가 나왔습니다.");
				break;
			default :
				System.out.println("6이 나왔습니다.");
		}

	}

}
