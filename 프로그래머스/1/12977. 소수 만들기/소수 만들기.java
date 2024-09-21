class Solution {
    public int solution(int[] nums) {
        int answer = nums.length * (nums.length - 1) * (nums.length - 2) / 6 ;

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    for (int l = 2; l <= Math.sqrt(nums[i] + nums[j] + nums[k]); l++) {
                        if ((nums[i] + nums[j] + nums[k]) % l  == 0) {
                            answer -= 1;
                            break;
                        }
                    }
                }
            }
        }

        return answer;
    }
}