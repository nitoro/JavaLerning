package jp.itacademy.samples.ensyu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Samplejisyo {

	public static void main(String[] args) {
		
		Map<String, String> jisyo = new HashMap<>();
		
		jisyo.put("apricot", "��");
		jisyo.put("mango", "�}���S�[");
		jisyo.put("lime", "���C��");
		
//		String line = "apricot", "��";
//		String[] tokens = line.split(":");
//		jisyo.put(tokens[0], tokens[1]);
		
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		
		String ja = jisyo.get(s);
		System.out.println(ja);
	}
}
