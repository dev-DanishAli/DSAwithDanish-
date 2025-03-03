public class ArrayMerging {

    public static void main(String[] args) {
        int [] arr1 = {1,2,3};
        int [] arr2 = {4,5,6};

        int arraySize = arr1.length + arr2.length;

        int [] newArray = new int[arraySize];

        for (int i=0; i<arr1.length; i++){
            newArray[i] = arr1[i];
        }

        for (int i=0; i<arr2.length; i++){
            newArray[arr1.length + i] = arr2[i];
        }

        for (int num : newArray){
            System.out.println(num + " ");
        }
    }
}
