# SENTIMENT ANALYSIS 

This program is built in JAVA and used the StanfordCore NLP library for the sentiment analysis of the text articles. 

## DATASET 

The following articles comprise our dataset:

- Britannica: Deepwater Horizon Oil Spill. Link for the article found here: https://www.britannica.com/event/Deepwater-Horizon-oil-spill

- Gaurdian : Deepwater Horizon and the Gulf oil spill - the key questions answered. Link for the article found here : https://www.theguardian.com/environment/2011/apr/20/deepwater-horizon-key-questions-answered 

- New York Times : Explosion in the Gulf. Link for the article found here: https://www.nytimes.com/2010/04/24/opinion/24sat2.html


## HOW TO SET-UP

- Download the following libraries, source files and text files given in this repository. 

- Download this additional library on your desktop (could not be added because it is bigger than 25 MB)

    http://central.maven.org/maven2/edu/stanford/nlp/stanford-corenlp/3.8.0/stanford-corenlp-3.8.0-models-english.jar


## HOW TO USE 

- Open the files in Eclipse 4.10 to ensure smooth running of the files

- Next thing would be to ensure you add these libraries and configure their build path. To configure the build path, go the src folder, click "Build Path" like it's shown below - 

![Screenshot 2019-11-16 at 3 23 19 AM](https://user-images.githubusercontent.com/52317352/68990398-97625100-0820-11ea-9a91-838e65daf7a9.png)

Next, go to Libraries and select classpath - 

![Screenshot 2019-11-16 at 3 23 43 AM](https://user-images.githubusercontent.com/52317352/68990402-9af5d800-0820-11ea-8841-5e0fb8d81c32.png)

Adding the external JAR libraries would be the final step

We finally have all the three libraries up and running for our use. 
- Once you have done that, add the file location to the article reader (Article.java class)

- After adding all three libraries and articles, go to main.java and just run the code!



