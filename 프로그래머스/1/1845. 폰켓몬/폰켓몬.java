import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        HashSet set = new HashSet();
        
        for (int num : nums) {
            set.add(num);
        }
        
        return Math.min(nums.length / 2, set.size());
    }
}
// 소요 시간: 4'54"