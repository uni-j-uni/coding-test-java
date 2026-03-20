import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        for (int i = l; i <= r; i++) {
            if (Integer.toString(i).replace("5", "").replace("0", "").length() == 0) {
                arr.add(i);
            }
        }
        
        if (arr.size() < 1) arr.add(-1);
        
        int[] arr2 = new int[arr.size()];
        
        for (int i = 0; i < arr.size(); i++) {
            arr2[i] = arr.get(i);
        }
        
        return arr2;
    }
}