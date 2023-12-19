import java.util.Scanner;

public class tempConversion {
public static void main(String[] args) { Scanner sc = new Scanner(System.in);
System.out.println("1. Celsius to Fahrenheit");
System.out.println("2. Celsius to Kelvin"); 
System.out.println("3. Fahrenheit to Celsius"); 
System.out.println("4. Fahrenheit to Kelvin"); 
System.out.println("5. Kelvin to Celsius"); 
System.out.println("6. Kelvin to Fahrenheit");

System.out.println("Enter the Temperature Conversion Nu:");
int nu = sc.nextInt();

double temperature, result;

switch (nu) {
case 1:
System.out.print("Enter temperature in Celsius: "); temperature = sc.nextDouble();
result = celsiusToFahrenheit(temperature); System.out.println("Result: " + result + " °F"); break;
case 2:
System.out.print("Enter temperature in Celsius: "); temperature = sc.nextDouble();
result = celsiusToKelvin(temperature); System.out.println("Result: " + result + " K"); break;
case 3:
System.out.print("Enter temperature in Fahrenheit: "); temperature = sc.nextDouble();
result = fahrenheitToCelsius(temperature); System.out.println("Result: " + result + " °C"); break;
case 4:
System.out.print("Enter temperature in Fahrenheit: "); temperature = sc.nextDouble();
result = fahrenheitToKelvin(temperature); System.out.println("Result: " + result + " K"); break;
case 5:
System.out.print("Enter temperature in Kelvin: "); temperature = sc.nextDouble();
result = kelvinToCelsius(temperature); System.out.println("Result: " + result + " °C");
 
break; case 6:
System.out.print("Enter temperature in Kelvin: "); temperature = sc.nextDouble();
result = kelvinToFahrenheit(temperature); System.out.println("Result: " + result + " °F"); break;
default:
System.out.println("Invalid choice! Please enter a number between 1 and 6.");
break;
}

}

public static double celsiusToFahrenheit(double celsius) {
return (celsius * 9 / 5) + 32;
}

public static double celsiusToKelvin(double celsius) {
return celsius + 273.15;
}

public static double fahrenheitToCelsius(double fahrenheit) {
return (fahrenheit - 32) * 5 / 9;
}

public static double fahrenheitToKelvin(double fahrenheit) {
return (fahrenheit + 459.67) * 5 / 9;
}

public static double kelvinToCelsius(double kelvin) {
return kelvin - 273.15;
}

public static double kelvinToFahrenheit(double kelvin) {
return (kelvin * 9 / 5) - 459.67;
}

}
