public class UniqueElement {

    public static int uniqueElement(int[]arr){
        int unique = 0;
        for (int num : arr){
            unique ^= num;
        }
        return unique;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,2,4,3,4};

        int number = uniqueElement(arr);

        System.out.println("Unique Element of array is: " + number);

    }
}
