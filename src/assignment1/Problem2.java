//Student Name: Alexis Torres (at39625),Lab Section:(17629)
package assignment1;
import java.util.Scanner;

public class Problem2 {
    static public void problem2Solution(String input){
        int runningSum = 0;
        int startIndex = 0; // keep treck of the index of the first letter for substring
        for(int i = 0; i < input.length(); i++){
            if((input.charAt(i) >= 0x41) && (input.charAt(i) <= 0x5A)){ // for captial letters A - Z (hex values)
                runningSum = runningSum + (input.charAt(i) - 0x40); // do -40 so the value associated with A is 1
            }
           else if((input.charAt(i) >= 0x61) && (input.charAt(i) <= 0x7A)){ // lowercaser a - z (hex values)
                runningSum = runningSum + (input.charAt(i) - 0x60);
            }
           else{ // everything else is a zero
               runningSum = runningSum + 0;
            }
            if(input.charAt(i) == ' '){// if a there is a space then it is a new word
                if(runningSum >= 100){
                    System.out.println(input.substring(startIndex,i+1)); // since index i is a space then adding one would
                                                                        // give the length of the word
                }
                runningSum = 0;
                startIndex = i + 1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentenceP2, senternceP3 ; // three variable for user input

        System.out.println("Running Problem 2 ....\n");
        System.out.print("Enter a sentence: ");
        sentenceP2 = scanner.nextLine();
        Problem2.problem2Solution(sentenceP2);
        System.out.println("\n-----Done Problem 2----");

    }
}
