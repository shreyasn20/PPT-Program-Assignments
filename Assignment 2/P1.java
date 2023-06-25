import java.util.Arrays;
class P1 {
    public static int maxSum(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        for (int i = 0; i < nums.length; i += 2) {
            max += nums[i]; 
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 2};
        int output = maxSum(nums);
        System.out.println(output);
    }
}
