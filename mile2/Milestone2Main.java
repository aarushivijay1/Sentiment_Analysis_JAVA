import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Collections;
import java.util.Collection;

public class Milestone2Main {

	public static void main (String [] args) throws Exception{ 
		
		Milestone2Article a = new Milestone2Article();
		String nytimes = "/Users/nicholasrichardson/Desktop/MILESTONE2-master/guardian.txt";
        Milestone2Counter c = new Milestone2Counter();
        String text = a.runArticles(nytimes);
        c.Counter(text);
        Milestone2StopWordEliminator nostopwords = new Milestone2StopWordEliminator();
        String nostopwordsstring = nostopwords.RemoveStopWords(text);
        System.out.println("The following are the statistics without stop words");
        c.Counter(nostopwordsstring);
        Milestone2freqtest f = new Milestone2freqtest();
        f.Frequency(nostopwordsstring);
        Milestone2VocabRichness rich = new Milestone2VocabRichness();
        rich.method1length(nostopwordsstring);
        rich.method2longestword(nostopwordsstring);
        rich.method3numberoforiginalwords(nostopwordsstring);
        rich.method4SATwords("/Users/nicholasrichardson/Desktop/MILESTONE2-master/satwords.txt", nostopwordsstring);
			
			analyze sentimentAnalyzer = new analyze();
			sentimentAnalyzer.initialize();
			answer sentimentResult = sentimentAnalyzer.getSentimentResult(nostopwordsstring);

			System.out.println("Sentiment Score: " + sentimentResult.getSentimentScore());
			System.out.println("Sentiment Type: " + sentimentResult.getSentimentType());
			System.out.println("Very positive: " + sentimentResult.getSentimentClass().getVeryPositive()+"%");
			System.out.println("Positive: " + sentimentResult.getSentimentClass().getPositive()+"%");
			System.out.println("Neutral: " + sentimentResult.getSentimentClass().getNeutral()+"%");
			System.out.println("Negative: " + sentimentResult.getSentimentClass().getNegative()+"%");
			System.out.println("Very negative: " + sentimentResult.getSentimentClass().getVeryNegative()+"%");



    }
    
}
