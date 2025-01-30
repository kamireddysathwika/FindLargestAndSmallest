public class FindLargestAndSmallest {

    public static void main(String[] args) {
        // Hardcoding the array elements
        int[] array = {34, 78, 12, 56, 9, 89, 4};

        // Calling the function to find and print the largest and smallest elements
        findLargestAndSmallest(array);
    }

    // Function to find and print the largest and smallest elements in the array
    public static void findLargestAndSmallest(int[] array) {
        // Initialize largest and smallest with the first element of the array
        int largest = array[0];
        int smallest = array[0];

        // Loop through the array to find the largest and smallest elements
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        // Print the results
        System.out.println("Largest Element: " + largest);
        System.out.println("Smallest Element: " + smallest);
    }
}

