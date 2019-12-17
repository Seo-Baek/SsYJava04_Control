package practise;

import java.util.Scanner;

public class Ex03_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("별의 최대 갯수를 입력하세요. : ");
		int star = sc.nextInt();
		
		// 총 라인 수는 ((입력받은 별의 최대 갯수)*2 -1)이 되어야한다!
		for(int i = 1; i <= 2*star-1; i++) {	//전체 라인 수
			int line = (i <= star) ? i : (star*2)-i;
			
			for(int j = 1; j <= line; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
	}

}
