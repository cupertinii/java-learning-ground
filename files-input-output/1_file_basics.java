import java.io.*;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    CreateNewFile_example();
    WriteTextToFile_using_FileWriter_example();
    ReadTextFromFile_using_scanner_example();
  }

  public static void CreateNewFile_example() {
    try {
      // Create File Object and specify new file name (optionally with path)
      File myFile = new File("myFile.txt");
      // Call createNewFile to create new file
      boolean bFileCreated = myFile.createNewFile();
      if(bFileCreated) {
        System.out.println("File created " + myFile.getPath() );
      }
      else {
        System.out.println("File already exists at " + myFile.getPath());
      }
    }
    catch (IOException e) {
      System.out.println("Exception caught");
    }
  }

  public static void WriteTextToFile_using_FileWriter_example() {
    try {
      FileWriter myFileWriter = new FileWriter("myFile.txt");
      myFileWriter.write("This is the sample data");
      myFileWriter.close();
    }
    catch (IOException e) {
      System.out.println("Exception caught");
    }
  }

  public static void ReadTextFromFile_using_scanner_example() {
    try {
      File myFile = new File("myFile.txt");
      var scanner = new Scanner(myFile);
      while (scanner.hasNext()) {
        String line = scanner.nextLine();
        System.out.println(line);
      }
    }
    catch (IOException e) {
      System.out.println("Exception caught");
    }
  }


}
