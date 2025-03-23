public class DuplicatesRemove {

    public static int duplicatesRemoval(int[]arr){
        if (arr.length==0) return 0;
        int i = 0;
        for (int j = 1; j < arr.length; j++){
            if (arr[j] != arr[i]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }
    public static void main(String[] args) {
        int [] arr = {1,1,3,4,5,5};

        System.out.print("Array Before: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        int newLength = duplicatesRemoval(arr);

        System.out.println("\nArray Before: ");
        for (int i = 0; i < newLength; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
