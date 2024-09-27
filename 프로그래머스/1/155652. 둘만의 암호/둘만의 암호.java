class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            int stop = 0;

            while (stop < index){
                ch = (char) ((ch - 97 + 1) % 26 + 97);
                if (!skip.contains(String.valueOf(ch))) {
                    stop++;
                }
            }
            sb.append(ch);
        }

        return sb.toString();
    }
}