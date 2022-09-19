//Student Name: Alexis Torres (at39625),Lab Section:(17629)
package assignment1;
import java.util.Scanner;
import edu.stanford.nlp.tagger.maxent.MaxentTagger;

public class Problem3 {
    static public void problem3Solution (String input){
        //create a new tagger object using props file I have
      MaxentTagger tagger =  new MaxentTagger("assignment1/english-bidirectional-distsim.tagger");
      String tagged = tagger.tagString(input); // this function tags the string
      System.out.println(tagged);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentenceP3;

        System.out.print("Enter a sentence: ");
        sentenceP3 = scanner.nextLine();
        problem3Solution(sentenceP3);



    }
}
