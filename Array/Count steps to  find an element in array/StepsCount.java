public class StepsCount {

    public static int linearSearch(int arr[], int value){
        int steps=0;
        for(int i = 0; i < arr.length; i++){
            steps++;
            if (arr[i]==value){
                System.out.println("Steps Taken " + steps);
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