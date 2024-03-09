public class SmallestElements {
    public static void main(String[] args) {
        int[] array = {12, 4, 6, 8, 10, 2, 5};
        findSmallestElements(array);
    }

    static void findSmallestElements(int[] array) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : array) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        System.out.println("Smallest element: " + smallest);
        System.out.println("Second smallest element: " + secondSmallest);
    }
}
