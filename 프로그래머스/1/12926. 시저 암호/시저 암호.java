class Solution {
            public String solution(String s, int n) {
                char[] array = s.toCharArray();
                StringBuilder sb = new StringBuilder();

                for (char ch : array) {
                    if (ch < 91 && ch + n > 90 || ch + n > 122) ch -= 26;
                    if (ch == ' ') sb.append(' ');
                    else sb.append((char)(ch + n));
                }

                return sb.toString();
            }
        }