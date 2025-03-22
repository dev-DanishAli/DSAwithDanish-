public class ArrayTwoSum {

    public static int [] twoSum (int[]arr, int target){
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] + arr[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{0};
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int target = 9;

        int [] result = twoSum(arr,target);

        System.out.println("Sum of Index " + result[0] + " And " + result[1] + " is equal to " + target);

    }
}
