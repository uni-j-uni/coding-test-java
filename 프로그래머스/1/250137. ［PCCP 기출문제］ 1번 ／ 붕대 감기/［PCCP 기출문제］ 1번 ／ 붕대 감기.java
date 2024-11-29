class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int max = health;
        for (int i = 0; i < attacks.length; i++) {
            int heal = 0;
            health -= attacks[i][1];
            if (health < 1) {
                return -1;
            }
            if (i + 1 == attacks.length) {
                return health;
            }
            
            for (int j = attacks[i][0]; j < attacks[i + 1][0] - 1; j++) {
                health += bandage[1];
                if (health >= max) {
                    health = max;
                    break;
                }
                heal++;
                if (heal == bandage[0]) {
                    health += bandage[2];
                    heal = 0;
                }
            }
            
        }
        return health;
    }
}