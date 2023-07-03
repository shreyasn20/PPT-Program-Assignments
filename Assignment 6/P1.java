import java.util.Arrays;
class P1 {
    public static int[] perm(String s) {
        int n = s.length();
        int low = 0;
        int high = n;
        int[] res = new int[n + 1];

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'I') res[i] = low++;
            else res[i] = high--;
        }
        res[n] = low;
        return res;
    }

    public static void main(String[] args) {
        String s = "IDID";
        int[] res = perm(s);
        System.out.println(Arrays.toString(res));
    }
}
