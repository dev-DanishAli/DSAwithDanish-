public class OccurrenceCount {

    public static int linearSearch(int arr[], int value){
        int count=0;
        for(int i = 0; i < arr.length; i++){
            if (arr[i]==value) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int []arr={1,3,5,6,3,7,9};
        int value=3;

        int result=linearSearch(arr,value);

        System.out.println(value + " Ocurred " + result + " Times");
    }
}