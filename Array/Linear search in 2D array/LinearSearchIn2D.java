public class LinearSearchIn2D {

    public static int[] linearSearch(int[][] arr, int value){
        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if (arr[i][j]==value){
                    return new int[] {i,j};
                }
            }
        }
        return new int [] {-1,-1};
    }

    public static void main(String[] args) {

        int[][] arr={
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15}
        };
        int value=3;

        int []result=linearSearch(arr,value);

        if(result[0]!=-1){
            System.out.println("Found at row " + result[0] + " column " + result[1]);
        }
        else{
            System.out.println("Element not found");
        }
    }
}