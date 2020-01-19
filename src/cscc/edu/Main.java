package cscc.edu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static final int lowestGrade = 0;
    static final int higestGrade = 100;
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        List<studentGrades> students = new ArrayList<studentGrades>();

        boolean done = false;
        System.out.println("!!! Student Grades Program !!!");
        while (!done) {
            printMenu();
            switch (getValidInput()){
                case 5:
                    done = true;
                    System.out.println("Bye from Student Grade program");
                    break;
                case 4:
                    fillStudents(students);
                    break;
                case 3:
                    listAllStudents(students);
                    break;
                case 2:
                    findStudent(students);
                    break;
                case 1:
                    addStudent(students);
                    break;
                default:
                    System.out.println("Please enter a number between 1 and 4!");
                    break;
            } // end of switch
        } // end of while
    } // end of main

    private static void listAllStudents(List<studentGrades> students) {
        System.out.println("\n!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("All Students listed below:");
        students.forEach((student) -> {
            String name = student.getStudentName();
            System.out.println("Student Name: " + name + " His Grade is: " + student.getStudentGrade().toString(student.getStudentGrade()));
        });
    }

    private static void findStudent(List<studentGrades> students) {
        System.out.println("\n");
        System.out.println("Enter Student Name to find (any matching regex string)");
        String str = input.nextLine();
        students.forEach((student) -> {
            String name = student.getStudentName();
            if (name.matches(str)) {
                System.out.println("Student Name: " + name + " His Grade is: " + student.getStudentGrade().toString(student.getStudentGrade()));
            }
        });
    }
    private static void addStudent(List<studentGrades> students) {
        boolean done = false;
        String name;
        Integer grade = lowestGrade;
        while (! done) {
            name = getString();
            if (name == null) continue;
            boolean gradeDone = false;
            while (!gradeDone) {
                grade = getIntegerGrade();
                if (grade == null) continue;
                gradeDone = true;
            } // while (!gradeDone)
            studentGrades student = new studentGrades("", studentGrades.gradeLetter.F);
            student.setStudentName(name);
            student.setStudentGradeInt(grade);
            students.add(student);
            System.out.println("Do you have more students to add? Y/n?");
            String inText = input.nextLine();
            if (inText.equals("n") || inText.equals("N"))
                done = true;
        } // while (! done)
    }

    private static Integer getIntegerGrade() {
        Integer grade;
        System.out.println("Enter Student Grade between " + lowestGrade + " and " + higestGrade + " inclusive");
        grade = getValidInput();
        if (grade < lowestGrade || grade > higestGrade) {
            System.out.println("Grade must be between "+ lowestGrade +" and " + higestGrade +" inclusive");
            return null;
        }
        return grade;
    }

    private static String getString() {
        String name;
        System.out.println("Enter Student Name as First Name, Last Name");
        name = input.nextLine();
        if ((name.equals(""))
                || (name == null)
                || !(name.matches("^[a-z ,A-Z']*$"))) {
            System.out.println("Name can only contain alphabets or the apostrophe(')");
            return null;
        }
        return name;
    }

    private static int getValidInput() {
        boolean done = false;
        while (!done) {
            if (!input.hasNextInt()){
                String word = input.next();
                System.out.println(word + " is not a number");
            } else {
                done = true;
                Integer i = input.nextInt();
                input.nextLine();
                return i;
            }
        }
        return 0;
    }

    private static void printMenu() {
        System.out.println("\n!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("Student Grades Program Menu!");
        System.out.println("Enter 1 for Add Student");
        System.out.println("Enter 2 for Find Student");
        System.out.println("Enter 3 for List all Students");
        System.out.println("Enter 4 to fill student data for testing with inline data");
        System.out.println("Enter 5 To end");
    } // end of printmenu
    private static void fillStudents(List<studentGrades> students) {
        studentGrades student = new studentGrades("prakash parasuram", studentGrades.gradeLetter.toGradeLetter(93));
        students.add(student);
        student = new studentGrades("mahesh bharatan", studentGrades.gradeLetter.toGradeLetter(92));
        students.add(student);
        student = new studentGrades("akhil snehdesh", studentGrades.gradeLetter.toGradeLetter(87));
        students.add(student);
        student = new studentGrades("agil andeswari", studentGrades.gradeLetter.toGradeLetter(83));
        students.add(student);
        student = new studentGrades("bat man", studentGrades.gradeLetter.toGradeLetter(82));
        students.add(student);
        student = new studentGrades("spider man", studentGrades.gradeLetter.toGradeLetter(77));
        students.add(student);
        student = new studentGrades("super man", studentGrades.gradeLetter.toGradeLetter(73));
        students.add(student);
        student = new studentGrades("some man", studentGrades.gradeLetter.toGradeLetter(72));
        students.add(student);
        student = new studentGrades("mars man", studentGrades.gradeLetter.toGradeLetter(69));
        students.add(student);
        student = new studentGrades("true man", studentGrades.gradeLetter.toGradeLetter(66));
        students.add(student);
        student = new studentGrades("god man", studentGrades.gradeLetter.toGradeLetter(62));
        students.add(student);
        student = new studentGrades("fail man", studentGrades.gradeLetter.toGradeLetter(59));
        students.add(student);
    }

}
