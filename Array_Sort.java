import java.util.Scanner;
class Array_Sort{
    public static void main(String str[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();   
        int[] arr = new int[n];
        System.out.print("Enter " + n + " array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] < arr[j]) {
                    int store = arr[j];
                    arr[j] = arr[i];
                    arr[i] = store;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}