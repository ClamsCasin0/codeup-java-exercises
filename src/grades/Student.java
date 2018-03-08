package grades;

import java.util.ArrayList;

public class Student {

    private String studentName;

    private ArrayList<Integer> grades;

    public Student(String studentName) {
        this.studentName = studentName;

        grades = new ArrayList<>();
    }

    public String getStudentName() {
        return studentName;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        int numberOfGrades = grades.size();
        double sumOfAllGrades = 0;
        double average;

        for(int grade : grades) {
            sumOfAllGrades += grade;
        }

        average = sumOfAllGrades / numberOfGrades;
        return average;
    }




    public static void main(String[] args) {

        Student student = new Student("Oscar");

        System.out.println(student.grades.size() + " is the total number of grades for " + student.getStudentName());

        student.addGrade(85);
        student.addGrade(78);
        student.addGrade(93);
        student.addGrade(90);
        student.addGrade(88);

        double gradeOutput = (85 + 78 + 93 + 90 + 88) / 5;

        System.out.println(gradeOutput + " is our grade average prediction");
        System.out.println(student.getGradeAverage() + " is the actual grade average of " + student.getStudentName());



    }
}
