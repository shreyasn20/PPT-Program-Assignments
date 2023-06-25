import java.util.HashSet;
import java.util.Set;
class P2 {
    public static int distCandies(int[] candyType) {
        int n = candyType.length;
        Set<Integer> set1 = new HashSet<>();
        set1.add(candyType[0]);
        for (int i = 1; i < n; i++) {
            if (candyType[i - 1] != candyType[i]) {
                set1.add(candyType[i]);
            }
            if (set1.size() > n / 2){
                return n / 2;
            } 
        }
        return set1.size();
    }

    public static void main(String[] args) {
        int[] candyType = {1, 1, 2, 2, 3, 3};
        int output = distCandies(candyType);
        System.out.println(output);
    }
}
