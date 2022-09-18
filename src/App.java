import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class App {
  public static void main(String[] args) throws Exception {
    try {
      File my_file = new File("C:\\Users\\HP\\Desktop\\inputoutput\\src\\schoolioperation\\maktech.txt");

      // creates new file
      if (!my_file.exists()) { 
        if (my_file.createNewFile()) {
          System.out.println("File has been created successfully " + my_file.getName());
        }
      } else {
        System.out.println("File already exist");
      }

    } catch (IOException e) {
      System.out.println("An error ocuured");
      e.printStackTrace();
    }

  }

  // write to the file
  static void writeToFile() {
    try {
      FileWriter myWriter = new FileWriter("C:\\Users\\HP\\Desktop\\inputoutput\\src\\schoolioperation\\maktech.txt");
      myWriter.write("I just want to have fun");
      myWriter.close();
      System.out.println("File succefully written to");
    } catch (IOException e) {
      System.out.println("An error don occcur ");
      e.printStackTrace();
    }
  }


  // Read from the file 
   static void ReadFromFile() {
      try {
           File readFile = new File("C:\\Users\\HP\\Desktop\\inputoutput\\src\\schoolioperation\\maktech.txt");
           Scanner in = new Scanner(readFile);
           while(in.hasNextLine()) {
            String data = in.nextLine();
            System.out.print(data);
           }
           in.close();
         
      } catch (IOException e) {
        System.out.println("An error occured");
        e.printStackTrace();
        // TODO: handle exception
      }
   }

   // delete a file 
   static void DeleteFile() {
    File dFile = new File("C:\\Users\\HP\\Desktop\\inputoutput\\src\\schoolioperation\\maktech.txt");
    if(dFile.delete()) {
      System.out.println ("File was deleted succesfully " + dFile.getName());
    }
    else {
      System.out.println("Failed to delete");
    }

   }
}
