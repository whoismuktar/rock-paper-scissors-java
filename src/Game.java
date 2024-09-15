
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import utils.Helper;

public class Game {

    static String[] playerOptions = {"rock", "paper", "scissors"};
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
        scanner.close();

        if (!Arrays.asList(playerOptions).contains(humanPlayerSelection)) {
            System.out.println("You entered an invalid option");
        } else {

            comPlayerSelection = (String) Helper.pickRandomItem(playerOptions);

            Map<String, String> result = Helper.getRoundResult(humanPlayerSelection, comPlayerSelection);

            System.out.println(result.get("description"));
        }
    }
}
