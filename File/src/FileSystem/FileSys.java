package FileSystem;

import java.io.File;  
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;  
import java.util.Scanner;

public class FileSys {
  public static void main(String[] args) {
	  int x;
	  System.out.println("1.create file");
	  System.out.println("2.write file");
	  System.out.println("3.read file");
	  Scanner s = new Scanner(System.in);
	  x=s.nextInt();
	  switch(x) {
	  
	  case 1:  try {
               File myObj = new File("E:\\FileSystem\\file.txt");
               if (myObj.createNewFile()) {
               System.out.println("File created: " + myObj.getName());
               } else {
               System.out.println("File already exists.");
               }
               } catch (IOException e) {
               System.out.println("An error occurred.");
               e.printStackTrace();
               }
               break;
	  case 2:  try {
               FileWriter myWriter = new FileWriter("E:\\FileSystem\\file.txt");
               myWriter.write("********Hello*********");
               myWriter.close();
               System.out.println("Successfully wrote to the file.");
               } catch (IOException e) {
               System.out.println("An error occurred.");
               e.printStackTrace();
               }
               break;
	  case 3:  try {
               File myObj = new File("E:\\FileSystem\\file.txt");
               Scanner myReader = new Scanner(myObj);
               while (myReader.hasNextLine()) {
               String data = myReader.nextLine();
               System.out.println(data);
               }
               myReader.close();
               } catch (FileNotFoundException e) {
               System.out.println("An error occurred.");
               e.printStackTrace();
               }
	           break;
  }}
}