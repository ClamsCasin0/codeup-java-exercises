package grades;

import util.Input;

import java.util.Arrays;
import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {
        Input input = new Input();

        HashMap<String, Student> students = new HashMap<>();
        String userInput;

        System.out.println("Initializing Preston Senior HS Grades Application................");
        System.out.println("1010101 10100101 101 0001 010101 1010100010 101001010101111101");
        System.out.println("Hello and Welcome!");
        System.out.println("Displaying registered students GitHub usernames.................");
        students = prestonSeniorHS();

        System.out.println("**-+=+-****-+=+-****-+=+-****-+=+-****-+=+-****-+=+-**");
        for(String key : students.keySet()) {
            System.out.print(key + "  |  ");
        }

        System.out.println();
        System.out.println("**-+=+-****-+=+-****-+=+-****-+=+-****-+=+-****-+=+-**");

        do {

            System.out.println("Enter student GitHub username for a list of grades and current grade average : ");
            userInput = input.getString();
            System.out.println("Please wait.........");
            System.out.println("**-+=+-****-+=+-****-+=+-****-+=+-****-+=+-****-+=+-****-+=+-****-+=+-**");
            System.out.println("Done Registering User Input!");
            System.out.println("Displaying entered student...................");

            if(students.containsKey(userInput)) {
                Student student = students.get(userInput);
                System.out.println();
//                System.out.println(students.get(key));
                System.out.println("Printing all grades for " + student.getStudentName() + "...............");
                System.out.println(student.getGrades());
                System.out.println(student.getStudentName() + " holds a grade average of " + student.getGradeAverage());

            } else {
                System.out.println("GitHub Username does not exist, Please try again");
            }

        } while (input.yesNo("Do you want to continue? y/n"));
        System.out.println("Exiting Preston Senior HS Students GitHub Grades Application.............");
        System.out.println("Good-Bye!");



    }


        public static HashMap<String, Student> prestonSeniorHS() {
            HashMap<String, Student> students = new HashMap<>();

            Student student1 = new Student("Napoleon");
            student1.addGrade(88);
            student1.addGrade(81);
            student1.addGrade(76);
            student1.addGrade(91);
            student1.addGrade(79);
            student1.addGrade(85);
            student1.addGrade(94);
            student1.addGrade(90);

            Student student2 = new Student("Uncle Rico");
            student2.addGrade(70);
            student2.addGrade(71);
            student2.addGrade(74);
            student2.addGrade(57);
            student2.addGrade(63);
            student2.addGrade(65);

            Student student3 = new Student("Pedro");
            student3.addGrade(92);
            student3.addGrade(96);
            student3.addGrade(89);
            student3.addGrade(98);
            student3.addGrade(95);
            student3.addGrade(99);

            Student student4 = new Student("Deb");
            student4.addGrade(88);
            student4.addGrade(90);
            student4.addGrade(92);
            student4.addGrade(86);
            student4.addGrade(95);
            student4.addGrade(93);
            student4.addGrade(91);

            students.put("TinaSucks05", student1);
            students.put("BestQB\"75", student2);
            students.put("PforPrez", student3);
            students.put("1%4ever", student4);

            return students;
        }
            //fix show usernames
//        public static void showUserNames(HashMap<String, Student> students) {
//        for (String key : students.keyset() ) {
//            System.out.println( key + "      ");
//
//        }
//            System.out.println();
//
//        }
    }

