
/**
 * Write a description of class SentenceBuilder here.
 *
 * @author (Emily Greene)
 * @version (920)
 */
public class SentenceBuilder
{
    String[] nouns = {"soccer ball", "elephant", "monkey", "Mr. Ettlin", "baseball", "beach", "boy", "girl", "dog", "cat", "Lamborghini", "classroom", "computer", "toaster", "dragon"};
    String[] verbs = {"steals", "runs", "screams", "jumps", "races", "high-fives", "sings", "swims", "plays", "cooks", "attacks", "sleeps", "drinks", "taunts", "drives"};
    String[] adjectives = {"quiet", "chubby", "angry", "tiny", "unkempt", "loud", "annoying", "strong", "exciting", "magnificent", "athletic", "speedy", "hilarious", "smart"};
    String[] determiners = {"his", "her", "their", "Mr. Malloy's", "our", "your", "its", "Mrs. Burbank's", "Isabelle's", "your neighbor's", "Will's", "this", "a", "my", "Bob's", "Mrs. Porter's", "Elon Musk's", "the"};
    String[] adverbs = {"quickly", "boldly", "excitedly", "carelessly", "gently", "awkwardly", "energetically", "kindly", "frightfully", "gracefully", "happily", "accidentally", "elegantly", "deliberately", "eventually", "foolishly", "obnoxiously", "repeatedly"};
    String[] prepositions = {"over", "under", "near", "behind", "above", "next to", "on", "below", "past", "before", "beside", "across", "outside", "around", "inside"};
    //prints out a sentence
    public void loadSentences(){
        System.out.println(getSentence());
    }
    //makes a sentence with a noun, verb, and prepositional phrase
    public String getSentence(){
        return(getNounPhrase() + " " + getVerbPhrase() + " " + getPrepositionalPhrase());
    }
    //returns a noun phrase
    public String getNounPhrase(){
        return(getRandomDeterminer() + " " + getRandomAdjective() + " " + getRandomNoun());
    }
    //returns a verb phrase
    public String getVerbPhrase(){
        return(getRandomAdverb() + " " + getRandomVerb());
    }
    //returns a prepositional phrase
    public String getPrepositionalPhrase(){
        return(getRandomPreposition() + " " + getRandomDeterminer() + " " + getRandomAdjective() + " " + getRandomNoun());
    }
    //returns a random noun from the nouns array
    public String getRandomNoun(){
        return(nouns[(int)(Math.random()*15)]);
    }
    //returns a random verb from the verbs array
    public String getRandomVerb(){
        return(verbs[(int)(Math.random()*15)]);
    }
    //returns a random adjective from the adjectives array
    public String getRandomAdjective(){
        return(adjectives[(int)(Math.random()*14)]);
    }
    //returns a random adverb from the adverbs array
    public String getRandomAdverb(){
        return(adverbs[(int)(Math.random()*18)]);
    }
    //returns a random determiner from the determiners array
    public String getRandomDeterminer(){
        return(determiners[(int)(Math.random()*18)]);
    }
    //returns a random preposition from the prepositions array
    public String getRandomPreposition(){
        return(prepositions[(int)(Math.random()*15)]);
    }
}
