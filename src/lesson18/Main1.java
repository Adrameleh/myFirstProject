package lesson18;

public class Main1 {
    public static void main(String[] args) {
        Tournament tournament = new Tournament();
        tournament.addTeam("Dinamo", 13);
        tournament.addTeam("Piter", 5);
        tournament.addTeam("Spatak", 9);
        tournament.addTeam("Ufcm", 0);
        tournament.addTeam("Ufcm", 5);

        tournament.printToConsole();
        tournament.printWinner();
        tournament.minusToTeam("Dinamo", 4);
        tournament.printToConsole();
        tournament.minusToTeam("Ufcm",1);
        System.out.println();
        tournament.printMiddlePoints();
    }
}
