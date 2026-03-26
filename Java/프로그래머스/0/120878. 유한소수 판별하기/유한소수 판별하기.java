import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int solution(int a, int b) {
        ArrayList<Integer> afactors = new ArrayList<>();
        ArrayList<Integer> bfactors = new ArrayList<>();
        
        while (a != 1) {
            for (int i = 2; i < 1001; i++) {
                if (a % i == 0) {
                    afactors.add(i);
                    a /= i;
                    break;
                }
            }
        }
        
        while (b != 1) {
            for (int i = 2; i < 1001; i++) {
                if (b % i == 0) {
                    bfactors.add(i);
                    b /= i;
                    break;
                }
            }
        }
        
        for (Integer afactor : afactors) {
            bfactors.remove(afactor);
        }
        
        for (Integer bfactor : bfactors) {
            if (bfactor != 2 && bfactor != 5) {
                return 2;
            }
        }
        
        return 1;
    }
}