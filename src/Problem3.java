/* Student Name: Alexis Torres (at39625),
 Lab Section:(17629)
 */

import edu.stanford.nlp.tagger.maxent.MaxentTagger; // this is the library of the tagger

public class Problem3 {
    static public void problem3Solution (String input){
        //create a new tagger object using props file I have
      MaxentTagger tagger =  new MaxentTagger("/Users/alexistorres/Documents/Code/422C/Assignment1/tagger/english-left3words-distsim.tagger");
      String tagged = tagger.tagString(input); // this function tags the string
      System.out.println(tagged);
    }
}
