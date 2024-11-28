import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> array = new ArrayList<>();
        Arrays.sort(terms);
        for (int i = 0; i < privacies.length; i++) {
            for (String term : terms) {
                if (term.charAt(0) == privacies[i].charAt(11)) {
                    int year = Integer.parseInt(term.substring(2)) / 12;
                    int month = Integer.parseInt(term.substring(2)) % 12;
                    String privacy = privacies[i].substring(0, 10).replaceAll("[.]", "");
                    
                    int result = year * 10000 + month * 100 + Integer.parseInt(privacy);
                    if (result % 10000 - 1200 > 28)
                        result += 8800;
                    if (year >= 1) {
                        result = result;
                    }
                    
                    System.out.println(result);
                    if (result - Integer.parseInt(today.replaceAll("[.]", "")) <= 0)
                        array.add(i + 1);
                    break;
                }
            }
        }
        int[] answer = new int[array.size()];
        
        for (int i = 0; i < array.size(); i++) {
            answer[i] = array.get(i);
        }
        
        return answer;
    }
}