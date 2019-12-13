package com.sist;

public class Ex08_DiceIf {

	public static void main(String[] args) {
		
		// 주사위의 숫자 중 하나를 임의로 받는다
		// 형식) (int)(Math.random() * 끝 값) + 시작값
		// 로또 (int)(Math.random() * 45) + 1 
		int num = (int)(Math.random() * 6) + 1;
		
		if(num == 1) {
			System.out.println("1이 나왔습니다.");
		} else if(num == 2) {
			System.out.println("2가 나왔습니다");
		} else if(num == 3) {
			System.out.println("3이 나왔습니다");
		} else if(num == 4) {
			System.out.println("4가 나왔습니다");
		} else if(num == 5) {
			System.out.println("5가 나왔습니다");
		} else {
			System.out.println("6이 나왔습니다");
		}
		
		
	
		
		
		
	}

}
