
/**
 * Write a description of class SentenceBuilder here.
 *
 * @author (Emily Greene)
 * @version (920)
 */
public class SentenceBuilder
{
    String[] nouns = {"soccer ball", "elephant", "monkey", "Mr. Ettlin", "baseball", "beach", "boy", "girl", "dog", "cat"};
    String[] verbs = {"steals", "runs", "screams", "jumps", "races", "high-fives", "sings", "swims", "plays", "cooks"};
    String[] adjectives = {"quiet", "chubby", "angry", "tiny", "unkempt", "loud", "annoying", "strong", "exciting", "magnificent", "athletic", "speedy", "hilarious", "smart"};
    String[] determiners = {"his", "hers", "their", "Mr. Malloy's", "our", "your", "its", "Mrs. Burbank's", "Isabelle's", "your neighbor's", "Will's", "this", "a", "an", "my", "Bob's", "Mrs. Porter's", "Elon Musk's", "the"};
    String[] adverbs = {"quickly", "boldly", "excitedly", "carelessly", "gently", "awkwardly", "energetically", "kindly", "frightfully", "gracefully", "happily", "afterwards", "today", "beforehand"};
    String[] prepositions = {"over", "under", "near", "behind", "above", "next to", "on", "below", "past", "before", "beside", "across", "outside", "around", "inside"};
    public SentenceBuilder()
    {

    }
    public void loadSentences(){
        
        
      
    }
    //public String getSetence(){}
    
    public String getNounPhrase(){
        return(determiners[(int)(Math.random()*19)] + " " + adjectives[(int)(Math.random()*14)] + " " + nouns[(int)(Math.random()*10)]);
    }
    public String getPrepositionalPhrase(){
        return(adverbs[(int)(Math.random()*14)] + " " + verbs[(int)(Math.random()*10)]);
    }
    //public String getVerbPhrase(){
       // return(prepositions[(int)(Math.random()*15)] + " " + determiners[(int)(Math.random()*19)] + " " + adjective
    //}
}
