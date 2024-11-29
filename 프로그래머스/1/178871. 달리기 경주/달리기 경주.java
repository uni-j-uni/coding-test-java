import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 1; i < players.length; i++) {
            map.put(players[i], i);
        }

        for (String called : callings) {
            int call = map.get(called);

            String tmp = players[call - 1];
            players[call] = players[call - 1];
            players[call - 1] = called;

            map.put(called, call - 1);
            map.put(tmp, call);
        }

        return players;
    }
}