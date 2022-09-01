/* Student Name: Alexis Torres (at39625),
 Lab Section:(17629)
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String digits, sentenceP2, senternceP3 ; // three variable for user input
        int adj;

        System.out.println("Running Problem 1 ....\n");
        System.out.println("Enter a 1000 digits: ");
        digits = scanner.nextLine();
        System.out.print("Enter how many adjacent: ");
        adj = scanner.nextInt();
        Problem1.problem1Solution(digits, adj);
        System.out.println("\n-----Done Problem 1----%n");

        System.out.println("Running Problem 2 ....\n");
        System.out.print("Enter a sentence: ");
        sentenceP2 = scanner.nextLine();
        Problem2.problem2Solution(sentenceP2);
        System.out.println("\n-----Done Problem 2----");

        System.out.println("Running Problem 3 ....\n");
        System.out.print("Enter a sentence: ");
        senternceP3 = scanner.nextLine();
        Problem3.problem3Solution(senternceP3);
        System.out.println("\n-----Done Problem 3----");

        //System.out.println(Problem1.problem1Solution("7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450", 4));
        //Problem2.problem2Solution("The wicked wizard`s wily wraith garnishes his master`s pasta with garlic.");
       //Problem3.problem3Solution("I was slowly walking to the park with my over enthusiastic dog when he bit me, and I shouted, Ouch!  ");
    }
}