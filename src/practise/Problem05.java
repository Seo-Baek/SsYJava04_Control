package practise;

public class Problem05 {

	public static void main(String[] args) {

		int hap = 0;
		int rev = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				rev = -i;
			} else {
				rev = i;
			}

			hap += rev;
		}

		System.out.println("hap ==> " + hap);
	}

}
