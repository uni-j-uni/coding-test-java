import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        Set<String> reportSet = new HashSet<>(Arrays.asList(report));
        Map<String, Integer> reportCount = new HashMap<>();
        Map<String, List<String>> reporterMap = new HashMap<>();
        Set<String> suspendedUsers = new HashSet<>();
        
        for (String r : reportSet) {
            String[] parts = r.split(" ");
            String reporter = parts[0];
            String reported = parts[1];
            
            reportCount.put(reported, reportCount.getOrDefault(reported, 0) + 1);
            reporterMap.computeIfAbsent(reporter, v -> new ArrayList<>()).add(reported);
        }
        
        for (String user : reportCount.keySet()) {
            if (reportCount.get(user) >= k) {
                suspendedUsers.add(user);
            }
        }
        
        for (int i = 0; i < id_list.length; i++) {
            String user = id_list[i];
            List<String> reportedList = reporterMap.get(user);
            
            if (reportedList == null) continue;
            
            for (String reportedUser : reportedList) {
                if (suspendedUsers.contains(reportedUser)) {
                    answer[i]++;
                }
            }
        }

        return answer;
    }
}