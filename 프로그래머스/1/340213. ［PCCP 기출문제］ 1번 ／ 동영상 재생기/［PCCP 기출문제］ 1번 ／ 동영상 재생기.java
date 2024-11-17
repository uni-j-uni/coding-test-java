class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int video_lenInt = Integer.parseInt(video_len.replaceAll(":", ""));
        int posInt = Integer.parseInt(pos.replaceAll(":", ""));
        int op_startInt = Integer.parseInt(op_start.replaceAll(":", ""));
        int op_endInt = Integer.parseInt(op_end.replaceAll(":", ""));
        
        for (String command : commands) {
;            if (posInt >= op_startInt && posInt < op_endInt) {
                posInt = op_endInt;
            }
            
            if (command.equals("next")) {
                if (posInt + 10 > video_lenInt) {
                    posInt = video_lenInt;
                } else {
                    if ((posInt % 100) + 10 > 59) {
                        if (posInt + 50 > video_lenInt) {
                            posInt = video_lenInt;
                        } else {
                            posInt += 50;
                        }
                    } else {
                        posInt += 10;
                    }
                }
            } else {
                if (posInt - 10 < 0) {
                    posInt = 0;
                } else {
                    if ((posInt % 100) - 10 < 0) {
                        posInt -= 50;
                    } else {
                        posInt -= 10;
                    }
                }
            }
            
            if (posInt >= op_startInt && posInt < op_endInt) {
                posInt = op_endInt;
            }
        }
        
        String answer = Integer.toString(posInt + 10000);
        
        return answer.substring(1, 3) + ":" + answer.substring(3);
    }
}