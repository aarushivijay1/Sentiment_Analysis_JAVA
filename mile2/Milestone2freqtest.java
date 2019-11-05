import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class Milestone2freqtest {

	public Milestone2freqtest(){
		
	}

		//this method makes a treemap of all the words with the number of times they appeared. 
		//then the top number is found, printed, and removed and this is done 10 times	
		public void Frequency(String nostopwords) throws FileNotFoundException {
		        Scanner console = new Scanner(System.in);
		        
				
				String freqstring = nostopwords;
				Scanner input = new Scanner(freqstring);

		        Map<String, Integer> wordCounts = new TreeMap<String, Integer>();
		        while (input.hasNext()) {
		            String next = input.next().toLowerCase();
		            if (!wordCounts.containsKey(next)) {
		                wordCounts.put(next, 1);
		            } else {
		                wordCounts.put(next, wordCounts.get(next) + 1);
		            }
				}
				
				for(int i = 0; i < 10; i++){
					int freq = 0;
					String mostFreqWord = "";
					for(Map.Entry<String,Integer> entry : wordCounts.entrySet()) {
						Integer value = entry.getValue();
						String key = entry.getKey();

  						if (freq < value.intValue()){
							  freq = value.intValue();
							  mostFreqWord = key.toString();
						  }
						  
					}
					System.out.println(mostFreqWord + " : " + wordCounts.get(mostFreqWord));
					wordCounts.remove(mostFreqWord);
					

				}
				
		    }
		}
