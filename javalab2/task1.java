class ArrayMinMax {
    public static void main(String[] args) {
        int[] arr = generateArray(1000); 
        long startTime = System.nanoTime(); // Start the timer

        int min = findMin(arr);
        int max = findMax(arr);

        long endTime = System.nanoTime(); // Stop the timer
        long runningTime = endTime - startTime;

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.println("Running Time: " + runningTime + " nanoseconds");
    }

    // Generate an array of random elements
    public static int[] generateArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        return arr;
    }

    // Find the minimum element in the array
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // Find the maximum element in the array
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}