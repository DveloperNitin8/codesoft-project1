import java.util.Random;
import java.util.Scanner;

public class numberGame {
    public static void main(String[] args) {
        int answer,guess;
        final int MAX=100;
        Scanner sc= new Scanner(System.in);
        Random rand=new Random();
        boolean yes=false;
        answer=rand.nextInt(MAX)+1;
        while (!yes) {
            System.out.print("Guess a number between 1 to 100: ");
            guess=sc.nextInt();
            if (guess>answer) {
              System.out.println("too high try again");  
            }
            else if (guess<answer) {
                System.out.println("too low try agin");
            }
            else{
                System.out.println("yes you guess the number");
                yes=true;
            }
        }
        System.exit(0);
    }
}
