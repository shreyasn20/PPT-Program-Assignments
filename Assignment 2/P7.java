class P7 {
    public static boolean isMonotonic(int[] nums) {
        boolean increasing = true;
        boolean decreasing = true;
        for (int i = 0; i < nums.length - 1; ++i) {
            if (nums[i] > nums[i+1]) increasing = false;
            if (nums[i] < nums[i+1]) decreasing = false;
        }
        return increasing || decreasing;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {5, 4, 3, 2, 5};
        boolean res1 = isMonotonic(nums1);
        System.out.println(res1);
        boolean res2 = isMonotonic(nums2);
        System.out.println(res2);
    }
}
