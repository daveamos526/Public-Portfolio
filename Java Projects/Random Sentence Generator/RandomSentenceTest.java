//RandomSentenceTest.java - Incorporate Word class and Sentence class to create
//a random sentence generator.
//David Amos
//References - 
//http://javadevnotes.com/java-string-array-examples
//http://stackoverflow.com/questions/2036970/how-do-getters-and-setters-work
//http://stackoverflow.com/questions/5725892/how-to-capitalize-the-first-letter-of-word-in-a-string-using-java
//https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html


//Import Random
import java.util.Random;

//Create Word class
class Word 
{
    //Create four arrays and set values contained within each one
      String article[] = {"the ", "a ", "one ", "some ", "any "},
               noun[] = {"boy", "girl", "dog", "town", "car"},
               verb[] = {" drove", " jumped", " ran", " walked", " skipped"},
               preposition[] = {" to ", " from ", " over ", " under ", " on "};
   
    //Create article getters
    String getArticle(int a)
        {
            return article[a];
        }
   
    String getArticle2(int b)
        {
            return article[b];
        }
    
    //Create noun getters
    String getNoun(int a)
        {
            return noun[a];
        }
    
    String getNoun2(int b)
        {
            return noun[b];
        }
    
    //Create verb getter
    String getVerb(int a)
        {
            return verb[a];
        }
    
    //Create preposition getter
    String getPreposition(int a)
        {
            return preposition[a];
        }
    
  
}

//Create Sentence class
class Sentence
{
    //Declare instance variable of type Word
    Word w=new Word();
    
    //Declare instance variable of type Random
    Random random = new Random();
    
    //Create sentence String
    String sentence;
    
    //Create method to build and return random sentences
    String getSentence()
    {
        sentence = "";
        for(int i=0;i<5;i++)
        {
            //Link variable values
            int a=random.nextInt(5);
            int b=random.nextInt(5);
             
            //Connect to Word class and create random Strings
            String random_article = w.getArticle(a);
            String random_noun = w.getNoun(a);
            String random_verb = w.getVerb(a);
            String random_preposition = w.getPreposition(a);
            String random_article2 = w.getArticle2(b);
            String random_noun2 = w.getNoun2(b);
            char c = random_article.charAt(0);            
            
            //Form random sentences (Capitalize first letter and add period
            sentence = random_article.replace(c, Character.toUpperCase(c)) +
                    random_noun + random_verb + random_preposition
                    + random_article2 + random_noun2+".\n";
            
        }
        return sentence;
    }
}

//Create main class
public class RandomSentenceTest 
{
    public static void main(String[]args)
    {
        
        //Create sentence object
        Sentence s=new Sentence();
        
        //Display 20 randomized sentences
        for(int i=0;i<20;i++)
        {
            System.out.println(s.getSentence());
        }
    }
}
