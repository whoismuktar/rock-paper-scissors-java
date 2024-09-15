
import java.util.Scanner;

public class Game {

    String[] playerOptions = {"rock", "paper", "scissors"};
    static String humanPlayerSelection;
    static String comPlayerSelection;

    public static String roundResult() {
        String result = "Scisors won";
        System.out.println(result);

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your pick? (rock/paper/scissors)");
        humanPlayerSelection = scanner.nextLine();

        roundResult();
    }
}
