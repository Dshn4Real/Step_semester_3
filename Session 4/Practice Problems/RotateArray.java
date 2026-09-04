public class RotateArray {

    static int[] rotateArray(int[] nums, int k) {

        int n = nums.length;

        k = k % n;

        int[] newArray = new int[n];

        for (int i = 0; i < n; i++) {
            int newPosition = (i + k) % n;
            newArray[newPosition] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = newArray[i];
        }

        return nums;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        rotateArray(nums, k);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}