public class FirstUnique {
	public static int firstUnique(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            boolean bool = true;
            for (int j = 0; j < str.length(); j++) {
                if (i != j && c == str.charAt(j)) {
                	bool = false;
                    break;
                }
            }
            if (bool) return i;
        }
        
        return -1;
    }

    public static void main(String[] args) {
        String s="loveleetcode";
        System.out.println(firstUnique(s));
        
    }
}
