import java.util.Scanner;
class Sum_And_Average_of_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.print("Enter " + n + " array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int sum = 0;
        for (int j=0; j<n; j++) {
            sum = sum + arr[j];
        }
        
        double average = (double) sum / n;
        
        System.out.println("Sum of Array: " + sum);
        System.out.println("Average of array: " + average);
        
        sc.close();
    }
}