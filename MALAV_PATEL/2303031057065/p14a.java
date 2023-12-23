class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
}

public class p14a {
    public static void main(String[] args) {
        Student stud = new Student("Ayush", 21);
        // Accessing private fields through getter methods
        System.out.println("Name: " + stud.getName());
        System.out.println("Age: " + stud.getAge());
        stud.displayInfo();
    }
}
