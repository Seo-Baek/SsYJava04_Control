package com.sist;

public class Delete_115p {
	public static void main(String[] args) {	
		int num = 18;
		if((num % 2 == 0 || num % 3 == 0) && num % 6 != 0) {
			System.out.println("1번 조건문의 결과값입니다.");
			System.out.println(num);
		}
		
		if(num % 2 == 0 || (num % 3 == 0 && num % 6 != 0)) {
			System.out.println("2번 조건문의 결과값입니다.");
			System.out.println(num);
		}

		String some = ";;;;;";
		int length = some.length();
		
		System.out.println(length);
		
	}
}
