import java.util.Scanner;

public class distCordinates {
public static void main(String[] args) { Scanner sc = new Scanner(System.in);
System.out.println("Enter Latitude and Longitude of city 1");
double lat1 = sc.nextDouble();
double lon1 = sc.nextDouble();

System.out.println("Enter Latitude and Longitude of city 2");
double lat2 = sc.nextDouble();
double lon2 = sc.nextDouble();

final double rad = 6378.1;

lat1 = Math.toRadians(lat1); 
lon1 = Math.toRadians(lon1); 
lat2 = Math.toRadians(lat2); 
lon2 = Math.toRadians(lon2);

double dlat = lat2 - lat1;
double dlon = lon2 - lon1;
double a = Math.pow(Math.sin(dlat / 2), 2) + Math.cos(lat1) * Math.cos(lat2) * Math.pow(Math.sin(dlon / 2), 2);

double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
double distance = rad * c;

System.out.println("Distance Between the two cities is: " + distance + " Kilometers");

}

}
 
