package fichierJava;

import java.io.*;
import java.util.Scanner;

public class FichierJava {

	public static void main(String[] args) {
	
   // long size1 = new File("f1.txt").length();
  //  System.out.println("file text 1 : "+ size1 + " Octets");
			   try {
					FileReader fileReader = new FileReader("C:/Users/HP/Desktop/northwind1.txt");
					BufferedReader reader = new BufferedReader(fileReader);
					String line = reader.readLine();
					
					while (line != null) {
						System.out.println(line);
						line = reader.readLine();
					}
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
   
			   try {
					FileWriter fileWriter = new FileWriter("C:/Users/HP/Desktop/northwind1.txt", false);
					BufferedWriter writer = new BufferedWriter(fileWriter);
			
					Scanner sc = new Scanner(System.in);
			
					System.out.println("entrer votre premier paragraphe");
					String  text1 = sc.next();
					
					System.out.println("entrer votre deuxieme paragraphe");
				    String text2 = sc.next();
				    
				    writer.newLine();
				    writer.write(text1);
					writer.newLine();
					writer.write(text2);
				
					writer.close();
					
					sc.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
 
			   
			

	}

}
