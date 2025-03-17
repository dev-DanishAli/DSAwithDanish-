public class Deletion {
    public static void main(String[] args) {
        int [] arr = {2,3,4,8,10,12};
        int loc = 1;
        int size = arr.length;

        for (int i=loc; i <size-1 ; i++){
            arr[i]=arr[i+1];
        }
        size--;

        System.out.print("Array After Deletion: ");
        for (int i=0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
