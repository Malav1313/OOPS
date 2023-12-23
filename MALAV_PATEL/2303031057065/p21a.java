// Two threads performing two tasks at a time.
public class p21a extends Thread
{
// Declare a String variable to represent task.
  String task;
 
p21a(String task)
{
  this.task = task; //refers to the current object in a method or constructor
}
public void run()
{
 for(int i = 1; i <= 5; i++)
 {
  System.out.println(task+ " : " +i); 	
  try
 {
    Thread.sleep(1000); // Pause the thread execution for 1000 milliseconds.
 }
 catch(InterruptedException ie) {
   System.out.println(ie.getMessage());	
  }
 } 
} 
public static void main(String[] args) 
{
// Create two objects to represent two tasks.
  p21a th1 = new p21a("Cut the ticket"); // Passing task as an argument to its constructor.
  p21a th2 = new p21a("Show your seat number");
  
// Create two objects of Thread class and pass two objects as parameter to constructor of Thread class.
  Thread t1 = new Thread(th1);
  Thread t2 = new Thread(th2);
  t1.start();
  t2.start();
  }
}
