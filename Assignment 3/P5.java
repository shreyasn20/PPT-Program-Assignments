import java.util.Arrays;
class P5 {
    public static int[] addOne(int[] digits) {
        int n = digits.length - 1;
        while (n >= 0 && digits[n] == 9) {
            n--;
        }
        if (n == -1) {
            int[] res = new int[digits.length + 1];
            res[0] = 1;
            return res;
        }
        int[] res = new int[digits.length];
        res[n] = digits[n] + 1;
        System.arraycopy(digits, 0, res, 0, n);
        return res;
    }

    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
        int[] res = addOne(digits);
        System.out.println(Arrays.toString(res));
    }
}
