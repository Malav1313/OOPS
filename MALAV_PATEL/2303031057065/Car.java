class BMW{
  String car_name;
  String fuel_type;
}
class Audi{
  String car_name;
  String fuel_type;
}

public class Car{

  public static void main(String[] args) {
    
// Creating an object of the BMW class 
      BMW bmw= new BMW();
      bmw.car_name="BMW_X7";
      bmw.fuel_type="Petrol";
      
// Creating an object of the Audi class 
      Audi ad= new Audi();
      ad.car_name="Audi_Q8";
      ad.fuel_type="Petrol";

      // Using the object to call methods and access fields
      System.out.println("Car name:"+bmw.car_name);
      System.out.println("Car Fuel Type:"+bmw.fuel_type);
      System.out.println(" ");
      System.out.println("Car name:"+ad.car_name);
      System.out.println("Car Fuel Type:"+ad.fuel_type);
}
}
