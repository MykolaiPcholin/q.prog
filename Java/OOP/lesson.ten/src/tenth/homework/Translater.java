package tenth.homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Translater {
	private static Map<String, String> translate = new HashMap<>();

	public Translater() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Translater(Map<String, String> translate) {
		super();
		this.translate = translate;
	}
	
	public void fileTranslation(File file) throws FileNotFoundException {
		
		try (Scanner sc = new Scanner(file)) {
			File fileOut = new File("Ukranian.out");
			String text = sc.nextLine();
			String[] textArr = text.toLowerCase().split("[ ]");
			try (PrintWriter pw = new PrintWriter(fileOut)) {
				for (int i = 0; i < textArr.length; i++) {
					if (translate.get(textArr[i]) != null) {
						pw.print(translate.get(textArr[i]) + " ");
						System.out.println(translate.get(textArr[i]) + " ");
					} else {
						pw.print(textArr[i] + " -translation not found- ");
						System.out.println(textArr[i] + " -translation not found- ");
					}
				}
			}
		}
		
	}
	
	public void addToDictionary() throws FileNotFoundException{
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter English word:");
			String engWord = sc.nextLine();
			System.out.println("Enter Ukranian word:");
			String ukrWord = sc.nextLine();
			translate.put(engWord, ukrWord);
		}
		
		File file = new File ("Dictionary.txt");
		try (PrintWriter pw = new PrintWriter(file)) {
			Set<Map.Entry<String, String>> hmtm = translate.entrySet();
			for (Map.Entry<String, String> hmte : hmtm) {
				pw.println(hmte.getKey() + ";" + hmte.getValue());
			}
		}
		System.out.println("Dictionary updated");
	}
	public static Map<String, String> loadMapFromDictionary() throws FileNotFoundException {
		Map<String, String> map = new HashMap<>();
		File file = new File("Dictionary.txt");
		try (Scanner sc = new Scanner(file)) {
			while (sc.hasNextLine()) {
				String text = sc.nextLine();
				String[] subStr = text.split(";");
				for (int i = 0; i < subStr.length; i++) {
					map.put(subStr[0], subStr[1]);
				}
			}
			return map;
		}
		
	}
	public static Map<String, String> getTranslate() {
		return translate;
	}

	public static void setTranslate(Map<String, String> translate) {
		Translater.translate = translate;
	}

	@Override
	public String toString() {
		return "Translater [translate=" + translate + "]";
	}
	
}
