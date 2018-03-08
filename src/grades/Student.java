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

    public void addGrade() {
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


}
