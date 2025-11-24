package Lecture16OOP;
public class Constructor {
    public static class Student{
        int rNo; // 0
        String name; //null
        double cgpa; // 0.0

        Student(int no,String str,double mark){
            rNo=no;
            name=str;
            cgpa=mark;
        }

        void print(){
            System.out.println(rNo+" "+name+" "+cgpa);
        }
    }
    public static void main(String[] args) {
         Student s1=new Student(30,"Onkar",8.5);
         s1.print();
    }
}
