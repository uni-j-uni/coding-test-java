import java.util.ArrayList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> list = new ArrayList<>();
        int prev = (99 - progresses[0]) / speeds[0] + 1;
        int cnt = 0;
        
        for (int i = 0; i < progresses.length; i++) {
            if ((99 - progresses[i]) / speeds[i] + 1 <= prev) {
            } else {
                list.add(cnt);
                prev = (99 - progresses[i]) / speeds[i] + 1;
                cnt = 0;
            }
            cnt++;
        }
        list.add(cnt);
        
        int[] answer = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
// 소요 시간: 26'01"