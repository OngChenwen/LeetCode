package AlgoExpert;

import java.util.ArrayList;
import java.util.HashMap;

public class TournamentWinner_Easy {

    public int Home_Time_Won = 1;

    public String tournamentWinner(
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

    public void updateScores(String team, int points, HashMap<String,Integer> scores){
        if(!scores.containsKey(team)) scores.put(team,0);
        scores.put(team,points + scores.get(team));
    }
}
