import java.util.Arrays;

class ArrayBinarySearch {
    public static void main(String[] args) {
        int[] arr = generateSortedArray(1000); 
        int target = (int) (Math.random() * 1000); 
        long startTime = System.nanoTime(); 

        int index = binarySearch(arr, target);

        long endTime = System.nanoTime(); 
        long runningTime = endTime - startTime;

        System.out.println("Target: " + target);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
        System.out.println("Running Time: " + runningTime + " nanoseconds");
    }

   
    public static int[] generateSortedArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        Arrays.sort(arr);
        return arr;
    }

    
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; 
            }

            if (arr[mid] < target) {
                left = mid + 1; 
            } else {
                right = mid - 1; 
            }
        }

        return -1; 
    }
}