class P8 {
    public static boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) return false;
        if (s.equals(goal)) {
            int[] frequency = new int[26];
            for (char ch : s.toCharArray()) {
                frequency[ch - 'a'] += 1;
                if (frequency[ch - 'a'] == 2) {
                    return true;
                }
            }
            return false;
        }
        int p1 = -1;
        int p2 = -1;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) != goal.charAt(i)) {
                if (p1 == -1) p1 = i;
                else if (p2 == -1) p2 = i;
                else return false;
            }
        }
        if (p2 == -1) return false;
        return s.charAt(p1) == goal.charAt(p2) && s.charAt(p2) == goal.charAt(p1);
    }

    public static void main(String[] args) {
        String s = "abcd", goal = "badc";
        boolean res = buddyStrings(s, goal);
        System.out.println(res);
    }
}
