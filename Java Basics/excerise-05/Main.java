import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        //Make sure there is no space between input.
      //System.out.println("Enter a word:");
        
    //Created the instance of Scanner with the constructor and saved it in the variable
    //System.in --> let scanner known to where to look for input
        Scanner sc = new Scanner(System.in);
        int userNumber = sc.nextInt();
        System.out.println(userNumber);
        double userNumber2 = sc.nextDouble();
        System.out.println(userNumber2);

        //To get the access of user input use sc.next()
        /*
        String userInput = sc.next();

        String uppercased = userInput.toUpperCase();
        System.out.println(userInput);
        System.out.println(uppercased);

        char firstCharacter = userInput.charAt(0);
        System.out.println(firstCharacter);

        System.out.println("Contains: " +
                userInput.contains("Enter".toLowerCase()));
        */

    }
}
