package Lecture16OOP;
public class ObjectPassByReferenceToMethod {
    public static class Student{
        String name;
        int rNo;
    }

    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Onkar";
        s1.rNo=30;

        change(s1);
        System.out.println(s1.name);

    }
    public static void change(Student s1){  //we also write Student s
        s1.name="Om";
    }
}
