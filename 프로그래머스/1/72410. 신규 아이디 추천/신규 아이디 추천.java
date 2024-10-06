class Solution {
        public String solution(String new_id) {
            new_id = new_id.toLowerCase();
            new_id = new_id.replaceAll("[^a-z_0-9.-]", "");
            new_id = new_id.replaceAll("\\.+", ".");
            if (new_id.charAt(0) == '.') new_id = new_id.replaceFirst("\\.", "");
            if (new_id.length() > 1 && new_id.charAt(new_id.length() - 1) == '.') new_id = new_id.substring(0, new_id.length() - 1);
            if (new_id.isEmpty()) new_id = "a";
            if (new_id.length() > 15) new_id = new_id.substring(0, 15);
            if (new_id.charAt(new_id.length() - 1) == '.') new_id = new_id.substring(0, new_id.length() - 1);
            while (new_id.length() < 3) new_id += new_id.charAt(new_id.length() - 1);

            return new_id;
        }
    }