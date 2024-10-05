class Solution {
    public String solution(String[] survey, int[] choices) {
        StringBuilder sb = new StringBuilder();
        int[] array = new int[4];  // [R+T], [C+F], [J+M], [A+N]
        
        for (int i = 0; i < survey.length; i++) {
            switch(survey[i]) {
                case "RT":
                    array[0] += choices[i] - 4;
                    break;
                case "TR":
                    array[0] += -choices[i] + 4;
                    break;
                case "CF":
                    array[1] += choices[i] - 4;
                    break;
                case "FC":
                    array[1] += -choices[i] + 4;
                    break;
                case "JM":
                    array[2] += choices[i] - 4;
                    break;
                case "MJ":
                    array[2] += -choices[i] + 4;
                    break;
                case "AN":
                    array[3] += choices[i] - 4;
                    break;
                case "NA":
                    array[3] += -choices[i] + 4;
                    break;
            }
        }
        sb.append(array[0] <= 0 ? "R" : "T");
        sb.append(array[1] <= 0 ? "C" : "F");
        sb.append(array[2] <= 0 ? "J" : "M");
        sb.append(array[3] <= 0 ? "A" : "N");
        
        return sb.toString();
    }
}