package gcr_codebase.String.LEVEL2;

import java.util.Scanner;

public class RockPaperScissors {

    public static String computerChoice() {

        int value = (int)(Math.random() * 3);

        if (value == 0) return "Rock";
        if (value == 1) return "Paper";

        return "Scissors";
    }

    public static String findWinner(String user,
                                    String computer) {

        if (user.equalsIgnoreCase(computer))
            return "Draw";

        if ((user.equalsIgnoreCase("Rock")
                && computer.equals("Scissors"))
                || (user.equalsIgnoreCase("Paper")
                && computer.equals("Rock"))
                || (user.equalsIgnoreCase("Scissors")
                && computer.equals("Paper")))
            return "User";

        return "Computer";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int games = sc.nextInt();

        int userWins = 0;
        int computerWins = 0;

        System.out.println(
                "User\tComputer\tWinner");

        for (int i = 0; i < games; i++) {

            String user = sc.next();

            String computer =
                    computerChoice();

            String winner =
                    findWinner(user, computer);

            if (winner.equals("User"))
                userWins++;
            else if (winner.equals("Computer"))
                computerWins++;

            System.out.println(user + "\t"
                    + computer + "\t\t"
                    + winner);
        }

        System.out.println(
                "\nUser Wins = " + userWins);

        System.out.println(
                "Computer Wins = " + computerWins);

        sc.close();
    }
}