import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Milestone2Article {
	String line;
	String article; 
	MileStone2Article(){
		
	}

	public BufferedReader reader;


	public String runArticles (String pathname) throws IOException {
		// Stores articles to be used in the main
	        File file = new File(pathname); 
	      	FileInputStream fileStream = new FileInputStream(file); 
	        InputStreamReader input = new InputStreamReader(fileStream); 
			//BufferedReader reader = new BufferedReader(input); 
			reader = new BufferedReader(input); 

			String response = new String();

		for (String line; (line = reader.readLine()) != null; response += line);
	        return response;//this returns a string of the article from the buffered reader
	        }
}