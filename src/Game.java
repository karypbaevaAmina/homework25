import java.util.Scanner;

public class Game {

    private User user;
    private Computer computer;
    private int userScore;
    private int computerScore;
    private int numberOfGames;


    public Game() {
        user = new User();
        computer = new Computer();
        userScore = 0;
        computerScore = 0;
        numberOfGames = 0;
    }

    public void startGame() {
        System.out.println("-----Start Game!-----\n" +
                "   ROCK, PAPER, SCISSORS!");
        Operation userMove = user.getUser();
        Operation computerMove = computer.getComputer();
        System.out.println("\n Your move: " + userMove + ".");
        System.out.println(" Computer move: " + computerMove + ".\n");

        int moves = userMove.searchWinner(computerMove);
        switch (moves) {
            case 0:
                System.out.println("Draw!");
                break;
            case 1:
                System.out.println(userMove + " beats " + computerMove + " You winner! ");
                userScore++;
                break;
            case -1:
                System.out.println(computerMove + " beats " + userMove + ".You lost.");
                computerScore++;
                break;
        }
        numberOfGames++;


        System.out.println("Would you like to play again? Enter 1-yes, 2-not");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0;
        if (number == 1) {
            startGame();
        } else if (number == 2) {
            System.out.println("You finished the game...");
            print();
        } else { count++;
        }
    }

    public void print() {
        int wins = userScore;
        int los = computerScore;
        int min = numberOfGames - userScore - computerScore;
        double percent = (wins + ((double) min) / 2) / numberOfGames;

        System.out.printf("|  %6s  |  %6s  |  %6s  |  %12s  |  %14s  |\n",
                "WIN", "LOSS", "DRAW", "TOTAL GAMES", "WIN PERCENTAGE");
        System.out.println("---------------------------------------------------------------------");
        System.out.printf("|  %6d  |  %6d  |  %6d  |  %12d  |  %13.2f%%  |\n",
                wins, los, min, numberOfGames, percent * 100);

    }



    public void startDifficultGame() {
        System.out.println("-----Start Game!-----\n" +
                "   ROCK, PAPER, SCISSORS, SPOCK, LIZARD!");
        Active userMove2 = user.getUser2();
        Active computerMove2 = computer.getComputer2();
        System.out.println("\n Your move: " + userMove2 + ".");
        System.out.println(" Computer move: " + computerMove2 + ".\n");

        int moves = userMove2.searchWinner2(computerMove2);
        switch (moves) {
            case 0:
                System.out.println("Draw!");
                break;
            case 1:
                System.out.println(userMove2 + " beats " + computerMove2 + " You winner! ");
                userScore++;
                break;
            case -1:
                System.out.println(computerMove2 + " beats " + userMove2 + ".You lost.");
                computerScore++;
                break;
        }
        numberOfGames++;


        System.out.println("Would you like to play again? Enter 1-yes, 2-not");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0;
        if (number == 1) {
            startDifficultGame();
        } else if (number == 2) {
            System.out.println("You finished the game...");
            print();
        } else { count++;
        }
    }


}





