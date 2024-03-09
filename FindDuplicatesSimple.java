public class FindDuplicatesSimple {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 5, 6, 7, 8, 9, 5};
        findDuplicates(array);
    }

    static void findDuplicates(int[] array) {
        System.out.print("Duplicate elements: ");
        
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.print(array[i] + " ");
                    break;  // Once a duplicate is found, no need to check further for this element
                }
            }
        }
    }
}
