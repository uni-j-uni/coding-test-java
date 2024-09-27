class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            int pass = index, i = 1;

            while (i <= pass) {
                if (ch + i > 122) ch -= 26;
                if (skip.contains(String.valueOf((char)(ch + i)))) pass++;
                i++;
            }
            ch = (char) (ch + pass > 122 ? (int) ch + pass - 26 : ch + pass);
            sb.append(ch);
        }

        return sb.toString();
    }
}