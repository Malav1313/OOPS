class Bike{
    int speed;
    String color;
    String Brand;
 
   Bike(String b, int s, String c){
     this.Brand = b;
     this.speed = s;
     this.color = c;
   }
    void display() {
      
       System.out.println(" ");
       System.out.println("Bike Colour is : "+color);
       System.out.println("Top Speed is : "+speed);
       System.out.println("Company is : "+Brand);
   }
 }
 
 public class bikeclass{
   public static void main(String[] args){
     Bike b1 = new Bike("Honda", 100, "Red");
     Bike b2 = new Bike("TVS", 150, "Black");
     Bike b3 = new Bike("Suzuki", 125, "Yellow");
 
     b1.display();
     b2.display();
     b3.display();
 
   }
 }