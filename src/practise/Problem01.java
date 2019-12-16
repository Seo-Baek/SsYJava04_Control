package practise;

import java.util.Scanner;

public class Problem01 {
	
	public static void main(String[] args) {
//		문) 지방(fat), 탄수화물(carbohydrate), 단백질(protein)
//	칼로리의합계를계산하는프로그램
//	지방, 탄수화물, 단백질의그램을키보드입력(Scanner 사용)
//	총칼로리구하기
//	지방1그램: 9칼로리
//	단백질과탄수화물1그램: 4칼로리
//	총칼로리= 지방* 9 + 단백질* 4 + 탄수화물* 4	
		
		Scanner sc = new Scanner(System.in);
		System.out.print("지방의 g을 입력하세요 : ");
		int fat = sc.nextInt();
		System.out.print("탄수화물의 g을 입력하세요 : ");
		int carb = sc.nextInt();
		System.out.print("단백질의 g을 입력하세요 : ");
		int prot = sc.nextInt();
		
		System.out.println();
		
		System.out.printf("총칼로리 = %,3d cal",((fat * 9) + (carb * 4) + (prot * 4)));
		
		sc.close();
	}

}
