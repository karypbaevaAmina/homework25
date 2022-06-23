import java.util.Scanner;


public class User {


    public User() {

    }
    public static Operation getUser() {
        System.out.println(" Enter one of these actions ROCK, SCISSORS, PAPER.");
        Scanner inputScanner = new Scanner(System.in);
        String userChoose =inputScanner.nextLine();
        userChoose = userChoose.toUpperCase();
        char firstLetter = userChoose.charAt(0);
        if (firstLetter == 'R' || firstLetter == 'P' || firstLetter == 'S') {
            switch (firstLetter) {
                case 'R':
                    return  Operation.ROCK;
                case 'P':
                    return Operation.PAPER;
                case 'S':
                    return Operation.SCISSORS;
            }
        }
        return getUser();
    }

}