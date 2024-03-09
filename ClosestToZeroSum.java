import java.util.Arrays;

public class ClosestToZeroSum {
    public static void main(String[] args) {
        int[] array = {1, 60, -10, 70, -80, 85};
        findClosestToZeroSum(array);
    }

    static void findClosestToZeroSum(int[] array) {
        Arrays.sort(array);

        int left = 0, right = array.length - 1;
        int closestSum = Integer.MAX_VALUE;
        int result1 = -1, result2 = -1;

        while (left < right) {
            int sum = array[left] + array[right];

            if (Math.abs(sum) < Math.abs(closestSum)) {
                closestSum = sum;
                result1 = array[left];
                result2 = array[right];
            }

            if (sum < 0) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println("Closest elements to zero: " + result1 + " and " + result2);
    }
}
