import java.util.ArrayList;
class Student{
    String name, roll_number;
    int[] marks;
    int obtainedMarks = 0;
    int totalmarks = 0;
    float percentage;
    int markLen;
    String result;
    float average;
    Student(String name, String roll_number, int[] marks){
        this.name = name;
        this.roll_number = roll_number;
        this.marks = marks;
        markLen = marks.length;
    }

    void average(){
        for (int mark : marks) {
            obtainedMarks += mark;
            totalmarks += 100;
        }
        average = (float) obtainedMarks /markLen;
    }

    void percentage(){
        percentage = ((float)obtainedMarks/totalmarks)*100;

        if (percentage>30){
            result = "Pass";
        }
        else{
           result = "Fail";
        }
    }

    void studentDetails(){
        average();
        percentage();
        System.out.println("Name: "+name);
        System.out.println("Roll number: "+roll_number);
        System.out.println("Obtained Marks: "+obtainedMarks);
        System.out.println("Average Marks: "+average);
        System.out.println("Total Marks: "+totalmarks);
        System.out.println("Percentage: "+percentage);
        System.out.println("Result: "+result);

    }
}
class Class{
    ArrayList<Student> students = new ArrayList<>();
    void add(Student obj){
        students.add(obj);
    }
    float total;
    void average(){
        for (Student student : students){
            total +=student.average;
        }
        System.out.println("Average of Class: "+(total/(students.size())));
    }
}

public class SimpleStudentManagementSystem {
    public static void main(String[] args) {
        int[] marks1 = {87, 89, 98, 78, 98};
        Student student1 = new Student("Kiran","23AI83", marks1);
        student1.studentDetails();
        int[] marks2 = {54, 76, 93, 78, 98};
        Student student2 = new Student("Maham","23AI82", marks2);
        student2.studentDetails();
        int[] marks3 = {87, 53, 76, 56, 76};
        Student student3 = new Student("Rabia","23AI87", marks3);
        student2.studentDetails();
        Class classS = new Class();
        classS.add(student1);
        classS.add(student2);
        classS.add(student3);
        classS.average();

    }
}