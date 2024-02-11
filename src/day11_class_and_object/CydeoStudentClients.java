package day11_class_and_object;

import day13_inheritance_practice.student_task.Student;

public class CydeoStudentClients {
    public static void main(String[] args) {

        CydeoStudent cydeoStudent1 = new CydeoStudent("Lalia", 22, 101, "A", 33, 10 );

        CydeoStudent cydeoStudent2 = new CydeoStudent("Mila",32, 202, "B", 33, 10 );

        cydeoStudent1.study();
        cydeoStudent2.attendClass();
        System.out.println("Student1: " + cydeoStudent1);
        System.out.println("Student2: " + cydeoStudent2);

    }
}
