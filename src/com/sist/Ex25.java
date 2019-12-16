package com.sist;

public class Ex25 {

	public static void main(String[] args) {
		
		System.out.println("** 구구단을 세로로 외자! **");
		System.out.println("--------------------");
		for(int i = 2; i < 10; i++) {		//단
			System.out.println(i + "단");
			for(int j = 1; j < 10; j++) {	//수
				System.out.println(i + " * " +  j + " = " + (i*j));
				
			}//내부 for
			
			System.out.println("--------------------");
		}//외부 for
		
		// 구구단 출력 - 가로로 출력
		System.out.println("** 구구단을 가로로 외자! **");
		for(int k = 2; k < 10; k++) { //구구단 타이틀 출력
			System.out.print("*** " + k + "단 ***\t");
		}
		System.out.println("");
		for(int i = 1; i < 10; i++) { 	  	//수
			for(int j = 2; j < 10; j++) {
				System.out.print(j + " * " +  i + " = " + (i*j)+ "\t");
			}//내부  for
			System.out.println("");
		}//외부 for
		
		
	}//main

}//class
