import java.util.*; 

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int SecretNumber = random.nextInt(100) + 1;
        int guess = 0;
        int attempts = 0;


        System.out.println("==== Number Guessing Game ====");
        System.out.println("Guess a Number between 1 to 100");

        while (guess != SecretNumber) {

            System.out.println("Enter Your Guess : ");
            guess = sc.nextInt();

            attempts++;

            if(guess > SecretNumber ) {
                System.out.println("Number is too High");
            } else if (guess < SecretNumber) {
                System.out.println("Number is too Low");               
            } else {
                System.out.println("Congratulations");
                System.out.println("You Guessed the Number");
                System.out.println("Attempts : " + attempts);
            }
            
        }

        sc.close();
    }
}