public class SelectionSort {
    public static void selectionSort(int [] arr){
        int index, temp;
        for (int i = 0; i < arr.length; i++){
            index = i;
            for(int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[index]){
                    index = j;
                }
            }
            temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int [] arr = {3,2,5,7,1,9};

        System.out.print("Before Sorting: ");
        for (int y : arr){
            System.out.print(y + " ");
        }

        selectionSort(arr);
        System.out.print("\nAfter Sorting: ");
        for (int z : arr){
            System.out.print(z + " ");
        }

    }
}