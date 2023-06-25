import java.util.HashMap;
import java.util.Map;
class P3 {
    public static int dHA(int[] nums) {
        int longest = 0;
        Map<Integer,Integer> m = new HashMap<>();
        for (int num: nums) {
            m.put(num, m.getOrDefault(num,0)+1);
        }
        for (int num: m.keySet()){
            if (m.containsKey(num+1)) longest = Math.max(longest,m.get(num)+m.get(num+1));
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,2,2,5,2,3,7};
        int res = dHA(nums);
        System.out.println(res);
    }
}
