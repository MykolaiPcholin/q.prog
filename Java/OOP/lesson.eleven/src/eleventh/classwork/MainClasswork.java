package eleventh.classwork;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.Map;

public class MainClasswork {

	public static void main(String[] args) {
	
//			try {
//				InetAddress inAddr = InetAddress.getByName("www.google.com");
//				System.out.println(inAddr);
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
		
//		String spec = "https://dou.ua";
//		try {
//			Map<String, List<String>> headers = NetworkService.getHeader(spec);
//			for (String k : headers.keySet()) {
//				System.out.println(k + " " + headers.get(k));
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		try {
//			String htmlText = NetworkService.getStringFromURL(spec, "UTF-8");
//			System.out.println(htmlText);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		String spec = "https://s.dou.ua/img/announces/image_ts_single_2.png";
//		File folder = new File("IMG");
//		folder.mkdirs();
//		
//		try {
//			NetworkService.downloadFileFromURL(spec, folder);
//			System.out.println("It`s done!");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		String html = "<!doctype html>\n<html>\n <head>\n<title>This is the sample webpage!</title>\n</head>\n"
				+ "<body>\nJava the best\n</body>\n</html>";
		try (ServerSocket serSocket = new ServerSocket(8080)) {
			for (;;) {
				Socket socket = serSocket.accept();
				SimpleServer ns = new SimpleServer(socket, html);
				Thread thr = new Thread(ns);
				thr.start();
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
