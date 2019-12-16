package practise;

import java.util.Scanner;

public class Problem06 {

	public static void main(String[] args) {
//		(문제2) coffee 메뉴를 키보드로 입력을 받고 주문수량과
//		입금액을 입력하면 아래 화면과 같이 출력되게 하세요.
//		※ 총금액에는 부가세가 포함된 금액이 나와야 함.

		Scanner sc = new Scanner(System.in);
		System.out.println("** coffee 메뉴 ***");
		System.out.println("1. 아메리카노 - 3,000원");
		System.out.println("2. 카페라떼 - 4,000원");
		System.out.println("3. 마키아또 - 4,500원");
		System.out.println("4. 바닐라라떼 - 4,500원");
		System.out.print("위 메뉴 중 하나를 선택하세요. : ");

		int menu = sc.nextInt();

		System.out.print("주문수량 >> ");
		int cups = sc.nextInt();

		System.out.println("입금액 >> ");
		int money = sc.nextInt();
		String coffee = null;
		int price = 0;

		if (menu == 1) {
			coffee = "아메리카노";
			price = 3000;
		} else if (menu == 2) {
			coffee = "카페라떼";
			price = 4000;
		} else if (menu == 3) {
			coffee = "마키아또";
			price = 4500;
		} else {
			coffee = "바닐라라떼";
			price = 4500;
		}

		int tot = (price * cups) + (int) ((price * cups) * 0.1);
		int change = money - tot;

		System.out.println("주문한 메뉴" + coffee);
		System.out.printf("커피단가 : %,3d 원\n" , price);
		System.out.println("주문수량 : " + cups + "잔");
		System.out.printf("입금액 : %,3d 원\n",money);
		System.out.printf("총금액 : %,3d 원\n" , tot);
		System.out.printf("거스름 돈 : %,3d 원\n " , change);

	}

}
