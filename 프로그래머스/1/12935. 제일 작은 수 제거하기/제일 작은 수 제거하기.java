class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) return new int[] { -1 };

        int min = Integer.MAX_VALUE , j = 0;
        int[] answer = new int[arr.length - 1];

        for (int num : arr) {
            if (num < min) min = num;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min) {
                answer[j] = arr[i];
            }
            else j--;
            j++;
        }

        return answer;
    }
}