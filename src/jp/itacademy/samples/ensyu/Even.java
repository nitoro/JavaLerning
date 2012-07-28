package jp.itacademy.samples.ensyu;

public class Even {

	public static void main(String[] args) {
		
		for (int i = 1; i<= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		for (int i = 1; i <= 100; i = i + 2) {
			System.out.println(i);
		}
		
		for (int i = 2; i <= 100; i += 2) {
			System.out.println(i);
		}
	}
}
