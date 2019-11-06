# DOCUMENTATION FOR MILESTONE 2

## DESIGN 

We have the following classes in our project -> 

- Article.java - This class basically reads whatever article you choose 

- StopWordEliminator.java - This class eliminates the stop words from the articles

- Counter.java - This class counts basic text statistics on the article with stopwords removed

- VocabRichness.java - This class tests if the stopwords removed article's vocab is rich or not 

- freqtest.java - This class does frequency test on the article with no stopwords

- analyze.java - This class uses StanfordCoreNLP to analyze the sentiment of the article without stopwords

- classify.java & answer.java - getters and setters for sentiment analysis 


## HOW TO USE 

- Download the following libraries, source files and text files given in this repository. 

- Download this additional library on your desktop (could not be added because it is bigger than 25 MB)

    http://central.maven.org/maven2/edu/stanford/nlp/stanford-corenlp/3.8.0/stanford-corenlp-3.8.0-models-english.jar

- Next thing would be to ensure you add these libraries and configure their build path. 

- Add the file location to the article reader (Article.java class)

- After adding all three libraries and articles, go to main.java and just run the code!



