import java.util.Scanner;

public class binarySearch{
    public static int Sort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return 0;
    }

    public static int Search(int[] arr, int low, int high, int target) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter the elements of the array (space-separated): ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        Sort(arr);
        System.out.println("Sorted array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("\nEnter the target element: ");
        int target = sc.nextInt();
        sc.close();

        int result = Search(arr, 0, arr.length - 1, target);
        System.out.println("Element found at index: " + result);
    }
}