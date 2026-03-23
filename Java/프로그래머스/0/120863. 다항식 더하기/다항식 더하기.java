import java.util.Arrays;

class Solution {
    public String solution(String polynomial) {
        String[] arr = polynomial.split(" \\+ ");
        int num1 = 0, num2 = 0;
        
        for (String num : arr) {
            if (num.contains("x")) {
                num1 += Integer.parseInt(num.equals("x") ? "1" : num.replace("x", ""));
            } else {
                num2 += Integer.parseInt(num);
            }
        }
        
        String answer = "";
        
        if (num1 == 1) {
            answer += "x";
        } else if (num1 != 0) {
            answer += num1 + "x";
        }
        
        if (num1 != 0 && num2 != 0) {
            answer += " + ";
        }
        
        if (num2 != 0) {
            answer += num2;
        }
        
        return answer;
    }
}