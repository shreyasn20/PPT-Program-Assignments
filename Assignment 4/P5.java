class P5 {
    public static int arrangeCoins(int n) {
        return (int) (Math.sqrt(2 * (long) n + 0.25) - 0.5);
    }

    public static void main(String[] args) {
        int n = 5;
        int res = arrangeCoins(n);
        System.out.println(res);
    }
}
