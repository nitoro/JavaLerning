package jp.itacademy.samples.ensyu;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.Map;
import java.util.Scanner;

public class Eiwa {

	public static void main(String[] args) throws Exception {
		
//		Map<K, V>
		
		try(Scanner scanner = new Scanner(new File("C:/Users/itacademy/dictionary.txt"))) {		
			while (scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
		}
	}
}

