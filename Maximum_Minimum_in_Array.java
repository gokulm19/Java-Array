import java.util.Scanner;
class Maximum_Minimum_in_Array{
    public static void main(String str[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.print("Enter " + n + " array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int max = 0;
        int min = arr[0];
        
        for (int j = 0; j < n; j++) {
            if (arr[j] > max) {
                max = arr[j];
            }
            if (arr[j] < min) {
                min = arr[j];
            }
        }
        
        System.out.println("Maximum of Array: " + max);
        System.out.println("Minimum of Array: " + min);
        
        sc.close();
    }
}