class Solution {
    public String[] solution(String[] strings, int n) {
        for (int i = 0; i < strings.length - 1; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                int index = n;
                if (strings[i].charAt(index) == strings[j].charAt(index)) {
                    index = 0;
                    while (strings[i].charAt(index) == strings[j].charAt(index) && index < strings.length) index++;
                }
                if (strings[i].charAt(index) > strings[j].charAt(index)) {
                    String tmp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = tmp;
                }
            }
        }

        return strings;
    }
}