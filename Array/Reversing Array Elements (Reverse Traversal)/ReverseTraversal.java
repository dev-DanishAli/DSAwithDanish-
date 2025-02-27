public class ReverseTraversal {

    public static void main(String[] args) {
        //initiliazing Array
        int [] arr = {1,2,3,4,5,6};

        //Printing Before Reversal
        System.out.print("Traversal Before Reversing: ");
        for(int i=0;i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        //Reversing Array
       for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        //Printing After Reversal
        System.out.print("\nTraversal After Reversing: ");
        for(int i=0;i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
