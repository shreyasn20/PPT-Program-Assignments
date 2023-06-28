import java.util.Arrays;
class P1 {
    public static int closestToTarget(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int res = 0;
        int dif = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (Math.abs(dif) > Math.abs(sum - target)) {
                    dif = sum - target;
                    res = sum;
                }
                if (sum < target) j++;
                else k--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        int res = closestToTarget(nums, target);
        System.out.println(res);
    }
}
