package Lecture16OOP;
public class ThisKeyword {
    public static class Student{
        int rNo; // 0
        String name; //null
        double cgpa; // 0.0

        Student(int rNo,String name,double cgpa){
            this.rNo=rNo;
            this.name=name;
            this.cgpa=cgpa;
        }

        void print(){
            System.out.println(rNo+" "+name+" "+cgpa);
        }
    }
    public static void main(String[] args) {
        Constructor.Student s1=new Constructor.Student(30,"Onkar",8.5);
        s1.print();
    }
}
