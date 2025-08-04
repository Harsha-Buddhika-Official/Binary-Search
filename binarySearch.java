public class binarySearch{
    public static int Search(int[] arr,int low, int high, int target){
        while(low <high){
            int mid = (low + (high - low)) / 2;
            if(mid == target){
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
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;
        int result = Search(arr, 0, arr.length -1, target);
        System.out.println("Element found at index: " + result);
    }
}