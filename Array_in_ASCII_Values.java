
import java.util.Scanner;

class Array_in_ASCII_Values{
    public static void main(String str[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of values in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter " + n + " array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("ASCII values of the array elements: ");
        for (int j = 0; j < n; j++) {
            System.out.print((char) arr[j] + " ");
        }
    }
}