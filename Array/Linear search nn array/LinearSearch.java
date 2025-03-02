public class LinearSearch {

    public static int linearSearch(int arr[], int value){
        for(int i = 0; i < arr.length; i++){
            if (arr[i]==value){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int []arr={1,3,5,7,9};
        int value=3;

        int result=linearSearch(arr,value);

        if(result!=-1){
            System.out.println("Element found at index "+result);
        }
        else{
            System.out.println("Element not found");
        }
    }
}