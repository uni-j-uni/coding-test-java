import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        int result = 1;
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        for (String[] cloth : clothes) {
            if (map.containsKey(cloth[1])) {
                map.replace(cloth[1], map.get(cloth[1]) + 1);
            } else {
                map.put(cloth[1], 1);
            }
        }
        
        if (map.size() == 1) {
            return clothes.length;
        }
        
        for (String key : map.keySet()) {
            Integer value = map.get(key);
            result = result * (value + 1);
        }
        
        return result - 1;
    }
}
// 소요 시간: 29'36"