class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        int left = 10, right = 12;

        for (int number : numbers) {
            if (number == 0) number = 11;
            if (number == 1 || number == 4 || number == 7) {
                sb.append("L");
                left = number;
            }
            else if (number == 3 || number == 6 || number == 9) {
                sb.append("R");
                right = number;
            }
            else if (number == 2 || number == 5 || number == 8 || number == 11) {
                int leftDistance = getDistance(left, number);
                int rightDistance = getDistance(right, number);

                if (leftDistance > rightDistance) {
                    sb.append("R");
                    right = number;
                }
                else if (leftDistance < rightDistance) {
                    sb.append("L");
                    left = number;
                }
                else {
                    if (hand.equals("left")) {
                        sb.append("L");
                        left = number;
                    }
                    else {
                        sb.append("R");
                        right = number;
                    }
                }
            }
        }
        return sb.toString();
    }

    private int getDistance(int current, int target) {
        int x1 = (current - 1) / 3, y1 = (current - 1) % 3;
        int x2 = (target - 1) / 3, y2 = (target - 1) % 3;
        return Math.abs(x1 - x2) + Math.abs(y1 - y2);
    }
}
