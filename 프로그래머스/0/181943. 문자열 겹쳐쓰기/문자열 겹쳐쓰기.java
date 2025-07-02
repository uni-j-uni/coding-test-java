class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String word = my_string.substring(s + overwrite_string.length());
        return my_string.replace(my_string.substring(s), overwrite_string + word);
    }
}