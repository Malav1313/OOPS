class student{
    private String name;
    private int age;

    public student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public String getAge(){
        return age;
    }

    public void displayInfo(){
        System.out.println("Student Name :" +name);
        System.out.println("Student Age :" +age);
    }

    public class encapsulation{
        public static void main(String[] args) {
            student stud = new student("Ayush Modi", 23);
            student stud2 = new student("Ayush Modi", 19);

            System.out.println("Name :" +stud.getName());
            System.out.println("Age :" +stud.getAge());
            System.out.println("Name :" +stud2.getName());
            System.out.println("Age :" +stud2.getAge());

            stud.displayInfo();
            stud2.displayInfo();
        }
    }
}

