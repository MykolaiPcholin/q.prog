package eighth;

import java.io.File;
import java.io.IOException;

public class Classwork {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    File file1 = new File("new file.txt");
    
    try {
      file1.createNewFile();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
    File folder1 = new File("NEW FOLDER");
    folder1.mkdirs();
    File file2 = new File(folder1, "a.txt");
    
    try {
		file2.createNewFile();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
    file1.delete();
    file2.delete();
    folder1.delete();
    
    File workFolder = new File("..");
    File[] files = workFolder.listFiles();
    for (int i = 0; i < files.length; i++) {
      String type = "File";
      if (files[i].isDirectory()) {
        type = "Folder";
      }
      System.out.println(files[i] + "   " + type + "   " + files[i].length());
    }

  }

}
