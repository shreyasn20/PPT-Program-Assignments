import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class P2 {
    public static List<List<Integer>> uniqueQuadruplets(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < n; j++) {
                if (j != (i + 1) && nums[j] == nums[j - 1]) continue;
                int k = j + 1;
                int l = n - 1;
                while (k < l) {
                    long sum = nums[i];
                    sum += nums[j];
                    sum += nums[k];
                    sum += nums[l];
                    if (sum == target) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        k++;
                        l--;
                        while (k < l && nums[k] == nums[k - 1]){
                          k++;
                        }
                        while (k < l && nums[l] == nums[l + 1]){
                          l--;
                        }
                    } 
                    else if (sum < target){
                      k++;
                    }
                    else l--;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        System.out.println(uniqueQuadruplets(nums, target));
    }
}
