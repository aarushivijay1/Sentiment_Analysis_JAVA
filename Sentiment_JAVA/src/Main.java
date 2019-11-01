

import java.io.IOException;


public class Main {

	public static void main(String[] args) throws IOException {

		String text = "WORK YOU FUCKING PIECE OF SHIT";
		
		Analyser sentimentAnalyzer = new Analyser();
		sentimentAnalyzer.initialize();
		Results sentimentResult = sentimentAnalyzer.getSentimentResult(text);

		System.out.println("Sentiment Type: " + sentimentResult.getSentimentType());
		System.out.println("Positive: " + sentimentResult.getSentimentClass().getPositive()+"%");
		System.out.println("Neutral: " + sentimentResult.getSentimentClass().getNeutral()+"%");
		System.out.println("Negative: " + sentimentResult.getSentimentClass().getNegative()+"%");

	}

}