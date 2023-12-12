import java.util.Scanner;

public class arraysum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter the size of array : ");
      
        int n = sc.nextInt();
      
        int a[] = new int[n];
      
        System.out.println("Enter the elements of array : ");
        
      for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
      
      for(int j = 0; j < a.length ; j++){
        sum = sum + a[j];
      }
        System.out.println("Sum of array is : " + sum);
    }
}