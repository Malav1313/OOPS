import java.time.LocalDate; import java.time.Period; import java.util.Scanner;

public class ageCalculator {

public static void main(String[] args) {

LocalDate currentYear = LocalDate.now(); Scanner sc = new Scanner(System.in); System.out.println("Enter the birthYear:"); int birthYear = sc.nextInt();


int age = calculateYear(currentYear.getYear(), birthYear); System.out.println("Your age Is " + age);

}
public static int calculateYear(int currentYear, int birthYear) { LocalDate currentDate = LocalDate.of(currentYear, 1, 1);
LocalDate birthDate = LocalDate.of(birthYear, 1, 1);

Period pe = Period.between(birthDate, currentDate);
return pe.getYears();
}

}
