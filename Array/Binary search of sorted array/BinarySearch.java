import java.util.Scanner;
public class BinarySearch {
    public static int binarySearch(int []arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start<=end){
            int mid = (start + end)/2;
            if (target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        int [] arr = {1,2,3,4,5,6,7,8,9,10};

        System.out.print("Enter The Target: ");
        int target = sc.nextInt();

        int result = binarySearch(arr,target);

        if (result!=-1){
            System.out.println("Element Fpund At " + result + " Index");
        }
        else{
            System.out.println("Element Not Found");
        }
    }
}