package jp.itacademy.samples.ensyu;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EnglishJapaneseDictionary {

	public static void main(String[] args) throws Exception {
		
		Map<String, String> jisyo = new HashMap<>();
		
		try(Scanner scanner = new Scanner(new File("C:/Users/itacademy/dictionary.txt"))) {
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String[] tokens = line.split(":");
				jisyo.put(tokens[0], tokens[1]);
			}
		}
		Scanner s = new Scanner(System.in);
		String en = s.nextLine();
		
		/*String*/ en = jisyo.get(en);
		System.out.println(en);			

	}
}