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

    public static Operation getUser2() {
        System.out.println(" Enter one of these actions 1-ROCK, 2-SCISSORS, 3-PAPER, 4-SPOCK, 5-LIZARD");
        Scanner inputScanner = new Scanner(System.in);
        int userChoose = inputScanner.nextInt();
            switch (userChoose) {
                case '1':
                    return  Operation.ROCK;
                case '2':
                    return Operation.SCISSORS;
                case '3':
                    return Operation.PAPER;
                case '4':
                    return Operation.SPOCK;
                case '5':
                    return Operation.LIZARD;
        }

        return getUser2();
    }

}