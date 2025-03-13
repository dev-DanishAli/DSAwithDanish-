import java.util.Scanner;

public class BinaryUnsorted {

    public static void bubbleSort(int [] arr){
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - i - 1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

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

        System.out.print("Enter The Size Of Array: ");
        int size = sc.nextInt();

        int [] arr = new int [size];

        for (int i = 0; i < size; i++){
            System.out.print("Enter " + i + " Index Value: ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Before Sorting: ");
        for (int sort : arr){
            System.out.print(sort + " ");
        }

        bubbleSort(arr);
        System.out.print("\nAfter Sorting: ");
        for( int num : arr){
            System.out.print(num + " ");
        }

        System.out.print("\nEnter The Target: ");
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
