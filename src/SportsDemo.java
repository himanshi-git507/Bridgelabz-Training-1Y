import java.util.*;

class Team implements Comparable<Team> {
    String name;
    int points;

    public Team(String name) {
        this.name = name;
        this.points = 0;
    }

    public void addPoints(int p) {
        points += p;
    }

    public int compareTo(Team t) {
        return t.points - this.points;
    }

    public String toString() {
        return name + " - " + points;
    }
}

class Match {
    Team team1;
    Team team2;

    public Match(Team t1, Team t2) {
        this.team1 = t1;
        this.team2 = t2;
    }
}

class Result {
    Team winner;

    public Result(Team winner) {
        this.winner = winner;
    }

    public String toString() {
        return "Winner: " + winner.name;
    }
}

public class SportsDemo {
    public static void main(String[] args) {
        Set<Team> teams = new HashSet<>();

        Team t1 = new Team("Team A");
        Team t2 = new Team("Team B");
        Team t3 = new Team("Team C");

        teams.add(t1);
        teams.add(t2);
        teams.add(t3);

        Queue<Match> matches = new LinkedList<>();
        matches.add(new Match(t1, t2));
        matches.add(new Match(t2, t3));
        matches.add(new Match(t1, t3));

        List<Result> results = new ArrayList<>();

        while (!matches.isEmpty()) {
            Match m = matches.poll();
            Team winner = m.team1;
            winner.addPoints(2);
            results.add(new Result(winner));
        }

        System.out.println("Results:");
        for (Result r : results) {
            System.out.println(r);
        }

        TreeSet<Team> leaderboard = new TreeSet<>(teams);

        System.out.println("\nLeaderboard:");
        for (Team t : leaderboard) {
            System.out.println(t);
        }
    }
}
