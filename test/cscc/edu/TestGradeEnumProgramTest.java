package cscc.edu;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TestGradeEnumProgramTest {
    List<studentGrades> students = new ArrayList<studentGrades>();
    @Test
    public void justTestGradeEnum(){
        fillStudents();
        // assertEquals()
    }

    private void fillStudents() {
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