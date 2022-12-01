package Livre.Bibliotheque_java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CsvImport {
	
	public void csv() {
		
		try
	    {
	      // Le fichier d'entrée
	      File file = new File("Book.csv");    
	      // Créer l'objet File Reader
	      FileReader fr = new FileReader(file);  
	      // Créer l'objet BufferedReader        
	      BufferedReader br = new BufferedReader(fr);  
	      StringBuffer sb = new StringBuffer();    
	      String line;
	      while((line = br.readLine()) != null)
	      {
	        // ajoute la ligne au buffer
	        sb.append(line);      
	        sb.append("\n");     
	      }
	      fr.close();    
	      System.out.println(sb.toString());  
	    }
	    catch(IOException e)
	    {
	      e.printStackTrace();
	    }
		
		
		

//	String pathFile= "Book.csv";
//	String line =" ";
//	try {
//		BufferedReader br = new BufferedReader(new FileReader(pathFile));
//		while((line =br.readLine())!=null)
//			System.out.println(line);
//		System.out.println("File Found");
//	}
//	
//	catch(FileNotFoundException e) {
//		e.printStackTrace();
//		System.out.println("File not Found");
//	}catch (IOException e) {
//		e.printStackTrace();
//	}
	}
	
}
