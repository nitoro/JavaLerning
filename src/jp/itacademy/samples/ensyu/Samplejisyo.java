package jp.itacademy.samples.ensyu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Samplejisyo {

	public static void main(String[] args) {
		
		Map<String, String> jisyo = new HashMap<>();
		
		jisyo.put("apricot", "ˆÇ");
		jisyo.put("mango", "ƒ}ƒ“ƒS[");
		jisyo.put("lime", "ƒ‰ƒCƒ€");
		
//		String line = "apricot", "ˆÇ";
//		String[] tokens = line.split(":");
//		jisyo.put(tokens[0], tokens[1]);
		
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		
		String ja = jisyo.get(s);
		System.out.println(ja);
	}
}
