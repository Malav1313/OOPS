import java.util.Scanner;

public class weightMars {

public static void main(String[] args) { Scanner sc = new Scanner(System.in);
System.out.println("Enter your Weight on Earth (in pound): ");

double earthWeight = sc.nextDouble();

double marsWeight = earthWeight * 0.38;

System.out.println("Your weight on mars would be: " + marsWeight
+ " pounds");

}
}
