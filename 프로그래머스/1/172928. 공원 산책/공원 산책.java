class Solution {
    public int[] solution(String[] park, String[] routes) {
        int x = 0, y = 0, len = 0;
        for (int i = 0; i < park.length; i++) {
            if (park[i].indexOf('S') != -1) {
                x = i;
                y = park[i].indexOf('S');
            }
        }
        
        for (String route : routes) {
            int n = Integer.parseInt(route.substring(2));
            switch (route.charAt(0)) {
                case 'N':
                    len = x - n;
                    if (len < 0) break;
                    
                    for (int i = x - 1; i >= len; i--) {
                        if (park[i].charAt(y) == 'X') break;
                        if (i == len) x -= n;
                    }
                    break;
                case 'S':
                    len = x + n;
                    if (len >= park.length) break;
                    
                    for (int i = x + 1; i <= len; i++) {
                        if (park[i].charAt(y) == 'X') break;
                        if (i == x + n) x += n;
                    }
                    break;
                case 'W':
                    len = y - n;
                    if (len < 0) break;
                    
                    for (int i = y - 1; i >= len; i--) {
                        if (park[x].charAt(i) == 'X') break;
                        if (i == len) y -= n;
                    }
                    break;
                case 'E':
                    len = y + n;
                    if (len >= park[x].length()) break;
                    
                    for (int i = y + 1; i <= len; i++) {
                        if (park[x].charAt(i) == 'X') break;
                        if (i == y + n) y += n;
                    }
                    break;
            }
            System.out.println(x + ", " + y);
        }
        
        return new int[] {x, y};
    }
}