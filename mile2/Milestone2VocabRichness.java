import java.util.ArrayList;
import java.text.*;
import java.io.File; 
import java.util.Scanner; 

public class Milestone2VocabRichness {
    
    int letter5 = 0;
    int letter6 = 0;
    int letter7 = 0;
    int letter8 = 0;
    int letter9 = 0;
    int letter10 = 0;
    int letter11up= 0;


	Milestone2VocabRichness(){
		
    }

    //this last method takes a txt file of sat words and sees how many of them appear in the string of words of the article
    public void method4SATwords(String text, String article) throws Exception{
        File file = new File(text); 
        Scanner sc = new Scanner(file); 
        String articleArray[] = article. split(" ");
        int numofsatwords = 0;

        ArrayList<String> words = new ArrayList<String>(); 
        while (sc.hasNextLine()) {
            words.add(sc.nextLine());
        }
        for(int i = 0; i< articleArray.length; i++){
            for(int j = 0; j< words.size(); j++){
                if (articleArray[i].equalsIgnoreCase(words.get(j))) {
                    numofsatwords++;
                }
            }

        }
        System.out.println("The number of SAT words in this article is " + numofsatwords);

        
    }

  //This method counts the length of words to see how many times different length words appear
    public void method1length(String article){
        String articleArray[] = article. split(" ");
        for(int i = 0; i< articleArray.length; i++){
            if(articleArray[i].length() == 5){
                letter5++;
            }
            if(articleArray[i].length() == 6){
                letter6++;
            }
            if(articleArray[i].length() == 7){
                letter7++;
            } 
            if(articleArray[i].length() == 8){
                letter8++;
            }
            if(articleArray[i].length() == 9){
                letter9++;
            }
            if(articleArray[i].length() == 10){
                letter10++;
            }
            if(articleArray[i].length() > 10){
                letter11up++;
            }
            
        }
        System.out.println("The number of 5 letter words was " + letter5);
        System.out.println("The number of 6 letter words was " + letter6);
        System.out.println("The number of 7 letter words was " + letter7);
        System.out.println("The number of 8 letter words was " + letter8);
        System.out.println("The number of 9 letter words was " + letter9);
        System.out.println("The number of 10 letter words was " + letter10);
        System.out.println("The number of 11 or more letter words was " + letter11up);


    }
    //method 2 for richness obtains the longest word and prints it out
    public void method2longestword(String article){
        String articleArray[] = article. split(" ");
        int longestwordlength = articleArray[0].length();
        int indexoflongestword = 0;
        for(int i = 0; i< articleArray.length; i++){
            if(articleArray[i].length() > longestwordlength){
                longestwordlength = articleArray[i].length();
                indexoflongestword = i;
            }
        }
        System.out.println("The longest word is " + articleArray[indexoflongestword] + " and it is " + longestwordlength + " letters.");

    }
    //method 3 of richness finds the percentage of new words used
    //it divides the total number of words by original words
    public void method3numberoforiginalwords(String article){
        String articleArray[] = article. split(" ");
        ArrayList<String> originalwords = new ArrayList<String>();

        for(int i = 0; i< articleArray.length; i++){

            if(!originalwords.contains(articleArray[i])){
                originalwords.add(articleArray[i]);
            }
        }
        System.out.println("The number of different words is " + originalwords.size());
        DecimalFormat df = new DecimalFormat("#.##");
        double percentage = (originalwords.size() * 100.0F / articleArray.length);
        System.out.println("The percentage of words that are different is " + df.format(percentage) + "%");

    }





}