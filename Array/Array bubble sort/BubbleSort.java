public class BubbleSort {

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

    public static void main(String[] args) {
        int [] arr = {3,2,5,1,7};

        System.out.print("Before Sorting: ");
        for (int sort : arr){
            System.out.print(sort + " ");
        }

        bubbleSort(arr);
        System.out.print("\nAfter Sorting: ");
        for( int num : arr){
            System.out.print(num + " ");
        }
    }
}
