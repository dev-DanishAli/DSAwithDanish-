public class FirstLastOccurence {

    public static int[] FirstLastOccurence(int []arr, int target){
        int first = -1;
        int last = -1;

        for (int i=0; i<arr.length; i++){
            if (arr[i] == target) {
                if (first == -1){
                    first = i;
                }
            }
            last = i;
        }
        return new int[]{first, last};
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,2,5,6,2,8};
        int target = 2;

        int [] result = FirstLastOccurence(arr, target);

        if (result[0] != -1){
            System.out.println("First Occurence At " + result[0] + " Index");
            System.out.println("First Occurence At " + result[1] + " Index");
        }
        else{
            System.out.println("Element Not Found");
        }
    }
}
