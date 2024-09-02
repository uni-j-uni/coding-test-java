class Solution {
    public String solution(String s) {
        String answer = "";
        String[] split = s.split(" ");
        int[] arr = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }
        int max = arr[0], min = arr[0];
        
        
        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        
        answer += min + " " + max;
        
        return answer;
    }
}