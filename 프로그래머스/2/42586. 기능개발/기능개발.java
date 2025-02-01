import java.util.ArrayList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> list = new ArrayList<>();
        int prev = (99 - progresses[0]) / speeds[0] + 1, cnt = 0;
        
        for (int i = 0; i < progresses.length; i++) {
            if ((99 - progresses[i]) / speeds[i] + 1 <= prev) {
                System.out.println("if");
            } else {
                list.add(cnt);
                prev = (99 - progresses[i]) / speeds[i] + 1;
                cnt = 0;
                System.out.println("else");
            }
            cnt++;
        }
        list.add(cnt);
        
        System.out.println("리스트: " + list + "cnt: " + cnt);
        
        int[] answer = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}