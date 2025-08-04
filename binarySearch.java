import java.util.Scanner;

public class binarySearch{
    public static int Search(int[] arr,int low, int high, int target){
        while(low <high){
            int mid = (low + (high - low)) / 2;
            if(arr[mid] == target){
                return mid;
            } else if (target > arr[mid]){
                return Search(arr, mid + 1, high, target);
            } else {
                return Search(arr, low, mid - 1, target);
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n = sc.nextInt();
        System.out.print("Enter the target element: ");
        int target = sc.nextInt();
        sc.close();
        int result = Search(arr, 0, arr.length -1, target);
        System.out.println("Element found at index: " + result);
    }
}