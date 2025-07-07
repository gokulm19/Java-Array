class Array_Value_Searching {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.print("Enter " + n + " array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter the value to search in the array: ");
        int valueToSearch = sc.nextInt();
        
        int count=0;
        int valueFound = 0;
        for (int j = 0; j < n; j++) {
            if (arr[j] == valueToSearch) {
                count++;
                valueFound = arr[j];
                break;
            }
        }
        
        if (count >0) {
            System.out.println("Value " + valueToSearch + " found in the array at index position: " + (valueFound-1));
        } else {
            System.out.println("Value " + valueToSearch + " not found in the array.");
        }
        
        sc.close();
    }
}