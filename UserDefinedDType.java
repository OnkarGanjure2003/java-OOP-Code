package Lecture16OOP;
import java.util.Scanner; //Scanner is class
public class UserDefinedDType {
    public static class Student{
        int rNo; //default value 0 we also change it as int rNo=13;
        String name;  //properties of Student //defaault value null
        double cgpa; //default value 0.0
        void print(){
            System.out.println(rNo+" "+name+" "+cgpa);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student s1=new Student();  //create s1 object of class student
        s1.rNo=30;   //stored values of properties inside object
        s1.name="Onkar";
        s1.cgpa=8.5;

        Student s2=new Student();
        s2.rNo=30;
        s2.name="Onkar";
        s2.cgpa=8.5;

        s1.print();
        s2.print();
    }
}
