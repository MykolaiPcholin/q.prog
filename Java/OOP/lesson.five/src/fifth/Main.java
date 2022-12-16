package fifth;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fileIn = new File ("C:\\Users\\Gamemax\\Pictures\\Saved Pictures\\photo1.jpg");
		File fileOut = new File("C:\\Users\\Gamemax\\Pictures\\" + fileIn.getName());
		
		File folderIn = new File("C:\\Users\\Gamemax\\Pictures\\Saved Pictures");
		File folderOut = new File("C:\\Users\\Gamemax\\Documents\\JavaFolderNew");
		
		String fileType = new String("jpg");
		
		try {
			System.out.println(FileService.copyFile(fileIn, fileOut));
			System.out.println("Copied your file");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			FileService.copyAllFiles(folderIn, folderOut);
			System.out.println("Copied all files");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Files not copied");
		}
		
		try {
			FileService.copySelectedFiles(folderIn,folderOut,fileType);
			System.out.println("Copied all " + fileType + " files");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Files not copied");
		}
	}

}
