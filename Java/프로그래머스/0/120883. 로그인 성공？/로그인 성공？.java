class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        
        for (String[] data : db) {
            if (data[0].equals(id_pw[0])) {
                if (data[1].equals(id_pw[1])) {
                    return "login";
                }
                return "wrong pw";
            }
        }
        
        return "fail";
    }
}