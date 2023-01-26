package eleventh.homework;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class MainHomework {
	
	public static void main(String[] args) {
		
		String spec = "https://dou.ua";
		
		try {
			String htmlText = HtmlPageChecker.getStringFromURL(spec, "UTF-8");
			HtmlPageChecker.getFileFromURL(htmlText);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		File file = new File("url.txt");
		
		try {
			HtmlPageChecker.websiteAccessibilityCheck(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
