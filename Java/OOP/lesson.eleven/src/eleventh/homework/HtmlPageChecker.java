package eleventh.homework;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class HtmlPageChecker {
	
	public static Map<String, List<String>> getHeader(String spec) throws IOException{
		URL url = new URL(spec);
		URLConnection connection = url.openConnection();
		return connection.getHeaderFields();
	}
	
	public static String getStringFromURL(String spec, String code) throws IOException {
		URL url = new URL(spec);
		URLConnection connection = url.openConnection();
		String text = "";
		try (BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), code))) {
			for (;;) {
				String temp = br.readLine();
				if (temp == null) {
					break;
				}
				text += temp + System.lineSeparator();
			}
			return text;
		}

	}
	
	public static void getFileFromURL(String str) throws IOException {

		File directory = new File("UrlList");
		directory.mkdirs();
		File file = new File(directory, "url.txt");

		String[] urlSplit = str.split(" ");
		try (PrintWriter pw = new PrintWriter(file)) {
			for (int i = 0; i < urlSplit.length; i++) {
				if (urlSplit[i].startsWith("href=\"http")) {
					System.out.println(urlSplit[i].substring(6, urlSplit[i].lastIndexOf("\"")));
					pw.println(urlSplit[i].substring(6, urlSplit[i].lastIndexOf("\"")));
				}
			}
		}
	}

	
	public static int getResponseCode(String spec) throws IOException {
		URL url = new URL(spec);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		return connection.getResponseCode();
	}
	
	public static void websiteAccessibilityCheck(File file) throws IOException {
		
		String result = "";
		try (Scanner sc = new Scanner(file)) {
			while (sc.hasNextLine()) {
				result += sc.nextLine() + System.lineSeparator();
			}
		}

		String[] arrLines = result.split("\n");
		for (int i = 0; i < arrLines.length; i ++) {
			if (!getHeader(arrLines[i]).isEmpty() && getResponseCode(arrLines[i]) == 200) {
				System.out.println(arrLines[i] + "available");
			} else {
				System.out.println(arrLines[i] + "not available");
			}
		}
	}
}
