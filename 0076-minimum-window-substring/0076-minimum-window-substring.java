class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> tmap = new HashMap<>();
        Map<Character, Integer> smap = new HashMap<>();

        for (char c : t.toCharArray()) {
            tmap.put(c, tmap.getOrDefault(c, 0) + 1);
        }

        int left = 0, right = 0, count = 0;
        int start = 0, end = 0;
        int minlength = Integer.MAX_VALUE;

        while (right < s.length()) {
            char ch = s.charAt(right);
            smap.put(ch, smap.getOrDefault(ch, 0) + 1);

            if (tmap.containsKey(ch) && smap.get(ch).intValue() == tmap.get(ch).intValue()) {
                count++;
            }

           
            while (left <= right && count == tmap.size()) {
                if (right - left + 1 < minlength) {
                    minlength = right - left + 1;
                    start = left;
                    end = right;
                }

                char leftChar = s.charAt(left);
                smap.put(leftChar, smap.get(leftChar) - 1);
                if (tmap.containsKey(leftChar) && smap.get(leftChar) < tmap.get(leftChar)) {
                    count--;
                }
                left++;
            }

            right++;
        }

        return minlength == Integer.MAX_VALUE ? "" : s.substring(start, end + 1);
    }
}
