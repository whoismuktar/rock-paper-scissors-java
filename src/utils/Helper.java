package utils;

import java.util.HashMap;
import java.util.Map;

public class Helper {

    public static String pickRandomItem() {
        return "rock";
    }

    public static Map<String, String> getRoundResult(String humanPlayerSelection, String comPlayerSelection) {
        System.out.println("Comparing...: " + humanPlayerSelection + "and" + comPlayerSelection);

        Map<String, String> result = new HashMap<>();
        if (humanPlayerSelection.equals(comPlayerSelection)) {
            String description = "Its a tie";
            result.put("description", description);
            result.put("winner", null);

            return result;
        }
        
        if (humanPlayerSelection.equals("rock")) {
            if (comPlayerSelection.equals("paper")) {
                String description = "You lose!" + comPlayerSelection + "won";
                result.put("description", description);
                result.put("winner", "computer");

                return result;
            }

            if (comPlayerSelection.equals("scissors")) {
                String description = "You win!" + humanPlayerSelection + "won";
                result.put("description", description);
                result.put("winner", "human");

                return result;
            }
        }

        if (humanPlayerSelection.equals("paper")) {
            if (comPlayerSelection.equals("scissors")) {
                String description = "You lose!" + comPlayerSelection + "won";
                result.put("description", description);
                result.put("winner", "computer");

                return result;
            }
            if (comPlayerSelection.equals("rock")) {
                String description = "You win!" + humanPlayerSelection + "won";
                result.put("description", description);
                result.put("winner", "human");

                return result;
            }
        }

        if (humanPlayerSelection.equals("scissors")) {
            if (comPlayerSelection.equals("rock")) {
                String description = "You lose!" + comPlayerSelection + "won";
                result.put("description", description);
                result.put("winner", "computer");

                return result;
            }
            if (comPlayerSelection.equals("paper")) {
                String description = "You win!" + humanPlayerSelection + "won";
                result.put("description", description);
                result.put("winner", "human");

                return result;
            }
        }

        return null;
    }
}
