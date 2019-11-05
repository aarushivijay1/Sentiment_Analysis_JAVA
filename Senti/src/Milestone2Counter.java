import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Milestone2Counter {

	Milestone2Counter(){

	}
	
	
	public void Counter(String read) throws IOException {
	
	       
	      int wordCount = 0; 
	      int sentenceCount = 0; 
		  int characterCount = 0;
          for(int i = 0; i<read.length(); i++){
            	if (read.charAt(i) == '.'|| read.charAt(i) == '?' || read.charAt(i) == '!'){
               		 sentenceCount++;
            	}
        }
	          System.out.println("Sentence Count: " + sentenceCount);//measures sentence count by counting end charcters
			
			  for(int i = 0; i< read.length(); i++){
            if (read.charAt(i) != ' '){
                characterCount++;//counts characters by coutning all charcters that are not spaces
            }
		}
			 System.out.println("Character Count: " + characterCount);
        for(int i = 0; i< read.length(); i++){
            if (read.charAt(i) == ' '){
                wordCount++;//counts the number of words by counting the number of spaces 
            }
		}
			System.out.println("Word Count: " + wordCount);

		
	}
	

} 
