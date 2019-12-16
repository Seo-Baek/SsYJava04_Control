package practise;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		
//		문) 1부터사용자가입력한수까지의합구하기
//	(예: 100을입력하면1에서100까지의홀수합과짝수합계출력)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력 : ");
		int max = sc.nextInt();
		int odd = 0, even = 0;
		for(int num = 1; num <= max; num++) {
			if(num % 2 == 1) {
				odd += num;
			} else {
				even += num;
			}
		}
		
		System.out.println("홀수 합계 : " + odd);
		System.out.println("짝수 합계 : " + even);
	}
}
