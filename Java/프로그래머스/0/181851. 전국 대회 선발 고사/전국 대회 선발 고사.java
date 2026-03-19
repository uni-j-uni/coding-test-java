import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) list.add(rank[i]);
        }
        
        Collections.sort(list);
        
        for (int i = 0; i < rank.length; i++) {
            if (rank[i] == list.get(0)) {
                answer += 10000 * i;
            } else if (rank[i] == list.get(1)) {
                answer += 100 * i;
            } else if (rank[i] == list.get(2)) {
                answer += i;
            }
        }
        
        return answer;
    }
}