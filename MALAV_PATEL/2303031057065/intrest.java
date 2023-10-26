import java.util.Scanner;

public class intrest {

public static void main(String[] args) { Scanner sc = new Scanner(System.in);
System.out.print("Enter the initial investment amount: ");
double principal = sc.nextDouble();

System.out.print("Enter the annual interest rate (in percentage): ");
double annualInterestRate = sc.nextDouble();
double monthlyInterestRate = annualInterestRate / 100 / 12; System.out.print("Enter the number of years: ");
int years = sc.nextInt();

double totalAmount = principal * Math.pow(1 + monthlyInterestRate, years * 12);

double totalInterestEarned = totalAmount - principal;

System.out.println("Total interest earned over " + years + " years is rs: " + totalInterestEarned);

}
}
 
