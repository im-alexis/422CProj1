//Student Name: Alexis Torres (at39625),Lab Section:(17629)
package assignment1;
import java.util.Scanner;

public class Problem1 {
    static public void problem1Solution (String input, int adjacent){
       int total ,highest ,num; // need to keep track of 3 nums
        total = highest = 1;
    for(int i = 0; i < input.length(); i++){ // Base number a.k.a the first number mutilplied. need index to keep track
        if((input.length() - i) - 1 < adjacent){ // if you have no more digits left than leave, otherwise outside array
            break;
        }
        for(int j = 0; j < adjacent; j++){
            num = input.charAt(j + i) - '0'; // change the character number to an integer value
            total = total * num;
        }
        if (total > highest){ // if there is a new highest
            highest = total;
        }
        total = 1;// reset the counter
    }
        System.out.println(highest);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String digits; // three variable for user input
        int adj;
        System.out.print("Enter how many adjacent: ");
        adj = scanner.nextInt();
        System.out.println("Enter a 1000 digits: ");
        digits = scanner.nextLine();

        Problem1.problem1Solution(digits, adj);



    }
}
