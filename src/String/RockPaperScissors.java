import java.util.Scanner;

public class RockPaperScissors {

    public static String computerChoice() {
        int n = (int)(Math.random() * 3);
        if (n == 0) return "rock";
        if (n == 1) return "paper";
        return "scissors";
    }

    public static String findWinner(String user, String comp) {
        if (user.equals(comp)) return "Draw";

        if (user.equals("rock") && comp.equals("scissors")) return "User";
        if (user.equals("paper") && comp.equals("rock")) return "User";
        if (user.equals("scissors") && comp.equals("paper")) return "User";

        return "Computer";
    }

    public static String[][] calculateStats(int userWins, int compWins, int games) {
        String[][] stats = new String[2][3];

        double userPercent = Math.round(((double)userWins / games) * 10000) / 100.0;
        double compPercent = Math.round(((double)compWins / games) * 10000) / 100.0;

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = userPercent + "%";

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(compWins);
        stats[1][2] = compPercent + "%";

        return stats;
    }

    public static void displayResults(String[][] games, String[][] stats) {
        System.out.println("Game\tUser\tComputer\tWinner");
        for (int i = 0; i < games.length; i++) {
            System.out.println((i + 1) + "\t" + games[i][0] + "\t" + games[i][1] + "\t\t" + games[i][2]);
        }

        System.out.println("\nPlayer\tWins\tWinning %");
        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int games = sc.nextInt();

        String[][] gameResults = new String[games][3];
        int userWins = 0;
        int compWins = 0;

        for (int i = 0; i < games; i++) {
            String user = sc.next().toLowerCase();
            String comp = computerChoice();
            String winner = findWinner(user, comp);

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) compWins++;

            gameResults[i][0] = user;
            gameResults[i][1] = comp;
            gameResults[i][2] = winner;
        }

        String[][] stats = calculateStats(userWins, compWins, games);
        displayResults(gameResults, stats);
    }
}
