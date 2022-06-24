import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        System.out.println( "Choose a game 1-simple, 2-difficult");
        Scanner scanner= new Scanner(System.in);
        int num = scanner.nextInt();
        if (num==1){
            game.startGame();
        } else if (num ==2) {
            game.startDifficultGame();
        } else {
            System.out.println("Incorrect number ");
        }
    }
}