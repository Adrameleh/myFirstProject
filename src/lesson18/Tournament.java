package lesson18;

import java.util.HashMap;

public class Tournament {
    private HashMap<String, Integer> table = new HashMap<>();

    public void addTeam(String teamName, int points) {
        if (table.containsKey(teamName)) {
            table.put(teamName, points + table.get(teamName));
        } else {
            table.put(teamName, points);
        }


    }

    public void printToConsole() {
        for (String key : table.keySet()) {
            System.out.print(key + " - ");
            System.out.println(table.get(key));
        }
    }

    public void printWinner() {
        int currentWinPoint = 0;
        String winnerKey = null;
        for (String key : table.keySet()) {
            if (table.get(key) > currentWinPoint) {
                winnerKey = key;
            }
        }
        System.out.println("The winner is:");
        System.out.print(winnerKey + " - ");
        System.out.println(table.get(winnerKey));
    }

    public void minusToTeam(String teamName, int points) {
        if (table.containsKey(teamName)) {
            if (table.get(teamName) > points) {
                table.replace(teamName, table.get(teamName) - points);
            }else
                table.replace(teamName, 0);
        } else {

        }
    }
}
