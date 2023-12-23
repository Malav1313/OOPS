import java.util.Scanner;

public class p11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int  sum=0;
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++)
        {
            arr[i] = scanner.nextInt();
	        sum= sum+a[i];
         }
        System.out.println("Sum of the elements in the array: " + sum);
        scanner.close();
    }
}
