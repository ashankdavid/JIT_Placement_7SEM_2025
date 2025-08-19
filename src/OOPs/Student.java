package OOPs;

public class Student {
    String name;
    int usn;
    static String college;

    Student(String n,int u){
        name = n;
        usn = u;
        college = "JIT";
    }

    void printDetails(){
        System.out.println("Student name is " + name);
        System.out.println("Student usn is " + usn);
        System.out.println("Student is in " + college);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Ashank", 123);
        Student s2 = new Student("Abhishek", 345);
        s1.printDetails();
        s2.printDetails();
    }
}
