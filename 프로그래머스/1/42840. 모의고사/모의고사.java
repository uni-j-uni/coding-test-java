import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        int[] correct = new int[3];
        int[] one = new int[] { 1, 2, 3, 4, 5 };
        int[] two = new int[] { 2, 1, 2, 3, 2, 4, 2, 5 };
        int[] three = new int[] { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
        int index1 = 0, index2 = 0, index3 = 0, max = 0;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == one[index1]) correct[0]++;
            if (answers[i] == two[index2]) correct[1]++;
            if (answers[i] == three[index3]) correct[2]++;
            index1 = index1 + 1 < one.length ? index1 + 1 : 0;
            index2 = index2 + 1 < two.length ? index2 + 1 : 0;
            index3 = index3 + 1 < three.length ? index3 + 1 : 0;
        }
        
        for (int num : correct) {
            max = Math.max(num, max);
        }
        
        for (int i = 1; i <= 3; i++) {
            if (correct[i - 1] == max) arrayList.add(i);
        }
        
        int[] answer = new int[arrayList.size()];
        
        for (int i = 0; i < arrayList.size(); i++) {
            answer[i] = arrayList.get(i);
        }
        
        return answer;
    }
}