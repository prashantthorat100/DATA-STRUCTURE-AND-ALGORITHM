public class peak {
    public static int findPeakElement(int[] nums) {
        int s = 0;
        int e = nums.length - 1;

        while (s < e) {
            int mid = s + (e - s) / 2;

            if (nums[mid] > nums[mid + 1]) {
                // Peak is at mid or on the left
                e = mid;
            } else {
                // Peak is on the right
                s = mid + 1;
            }
        }

        return s;
    
    }

    public static void main(String[] args) {
        int arr[]= {0};
        System.out.println(findPeakElement(arr));
    }
}
