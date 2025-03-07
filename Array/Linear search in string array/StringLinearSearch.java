public class StringLinearSearch {

        public static int linearSearch(String []arr ,  String target){
            for(int i = 0; i < arr.length; i++){
                if (arr[i]==target){
                    return i;
                }
            }
            return -1;
        }

        public static void main(String[] args) {

            String [] arr = {"Danish", "Faizal", "Ibrahim", "Rajeev", "Mehdi"};
            String target = "Danish";

            int result=linearSearch(arr,target);

            if(result!=-1){
                System.out.println(target + " Found at index "+result);
            }
            else{
                System.out.println("Target not found");
            }
        }
    }