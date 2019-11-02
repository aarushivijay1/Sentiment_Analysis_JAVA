import java.io.IOException;

public class mains {



		public static void main(String[] args) throws IOException {

			String text = "Particularly not very good response from his side"; //change the text to anything you want (THE ARTICLE FILE)
			
			analyze sentimentAnalyzer = new analyze();
			sentimentAnalyzer.initialize();
			answer sentimentResult = sentimentAnalyzer.getSentimentResult(text);

			System.out.println("Sentiment Score: " + sentimentResult.getSentimentScore());
			System.out.println("Sentiment Type: " + sentimentResult.getSentimentType());
			System.out.println("Very positive: " + sentimentResult.getSentimentClass().getVeryPositive()+"%");
			System.out.println("Positive: " + sentimentResult.getSentimentClass().getPositive()+"%");
			System.out.println("Neutral: " + sentimentResult.getSentimentClass().getNeutral()+"%");
			System.out.println("Negative: " + sentimentResult.getSentimentClass().getNegative()+"%");
			System.out.println("Very negative: " + sentimentResult.getSentimentClass().getVeryNegative()+"%");

		}
}
