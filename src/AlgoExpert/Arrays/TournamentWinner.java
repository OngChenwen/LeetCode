package AlgoExpert.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TournamentWinner{

    public static int Home_Time_Won = 1;

    public static String tournamentWinner(

            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
            String bestTeam = "";
            HashMap<String,Integer> scoreMap = new HashMap<String,Integer>();
            scoreMap.put(bestTeam,0);

        for(int i = 0; i < competitions.size(); i++){
            String hometeam = competitions.get(i).get(0);
            String awayteam = competitions.get(i).get(1);

            int result = results.get(i);

            String winningTeam = (result == Home_Time_Won) ? hometeam : awayteam;

            updateScores(winningTeam,3,scoreMap);

            if (scoreMap.get(winningTeam) > scoreMap.get(bestTeam)) bestTeam = winningTeam;

        }

        return bestTeam;

    }

    public static void updateScores(String team, int points, HashMap<String,Integer> scores){
        if(!scores.containsKey(team)) scores.put(team,0);
        scores.put(team,points + scores.get(team));
    }

    public static void main(String[] args) {
        ArrayList<String> competition1 = new ArrayList<>(Arrays.asList("HTML","C#"));
        ArrayList<String> competition2 = new ArrayList<>(Arrays.asList("C#","Python"));
        ArrayList<String> competition3 = new ArrayList<>(Arrays.asList("Python","HTML"));
        ArrayList<ArrayList<String>> competitions = new ArrayList<>();

        competitions.add(competition1);
        competitions.add(competition2);
        competitions.add(competition3);

        ArrayList<Integer> result = new ArrayList<>(Arrays.asList(0,0,1));
        System.out.println(tournamentWinner(competitions,result));


    }
}
