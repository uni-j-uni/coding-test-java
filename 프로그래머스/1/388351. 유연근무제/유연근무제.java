import java.util.*;

class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < timelogs.length; i++) {
            list.add(i);
        }
        
        for (int i = startday; i < startday + 7; i++) {
            if (i % 7 == 6 || i % 7 == 0) continue;
            
            for (int j = list.size() - 1; j >= 0; j--) {
                int time = schedules[list.get(j)] + 10;
                if (time % 100 > 59) {
                    time = time + 100 - 60;
                }
                if (timelogs[list.get(j)][i - startday] > time){
                    list.remove(j);
                }
            }
        }
        
        return list.size();
    }
}