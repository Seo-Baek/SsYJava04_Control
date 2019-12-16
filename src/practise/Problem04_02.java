package practise;

public class Problem04_02 {
	
	public static void main(String[] args) {
		
		char a = '*';
		for(int i = 0; i <= 10; i++) {
			if(i <= 5) {
				for(int j = 0; j <= i; j++) {
					System.out.print(a);
				}
				System.out.println("");
			} else {
				for(int j = 0; j <= 10-i; j++) {
					System.out.print(a);
				}
				System.out.println("");
			}
		}//외부for 문
		
		
		
		
		
	}//main
}//class

		
		
