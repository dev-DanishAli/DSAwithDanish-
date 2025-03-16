import java.util.Scanner;
public class Insertion {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of Array:");
        int size = sc.nextInt();

        int [] arr = new int[size+1];

        System.out.print("Enter Array Elements: ");
        for (int i = 0; i < size; i++){
            arr[i]= sc.nextInt();
        }

        System.out.print("Your Array: ");
        for (int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print("\nEnter The Location: ");
        int loc = sc.nextInt();
        System.out.print("Enter The Element: ");
        int item = sc.nextInt();

        for (int i = size; i > loc; i--){
            arr[i] = arr[i-1];
        }
        arr[loc]=item;
        size++;

        System.out.print("Array After Insertion: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}