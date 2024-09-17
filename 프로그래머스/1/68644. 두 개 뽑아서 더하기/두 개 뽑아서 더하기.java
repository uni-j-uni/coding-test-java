import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        StringBuilder result = new StringBuilder();

        result.append(" ");
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                String num = String.valueOf(numbers[i] + numbers[j]);
                if (!result.toString().contains(" " + num + ",")) {
                    result.append(numbers[i] + numbers[j]).append(", ");
                }
            }
        }

        String[] nums = result.toString().replaceAll(" ", "").split(",");
        int[] answer = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            answer[i] = Integer.parseInt(nums[i]);
        }
        Arrays.sort(answer);

        return answer;
    }
}