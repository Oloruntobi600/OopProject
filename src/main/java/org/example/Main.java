package org.example;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1, "lizzy", 500);
        Teacher mellisa = new Teacher(2, "mellisa", 700);
        Teacher Vanderhorn = new Teacher(3, "vanderhorn", 600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(mellisa);
        teacherList.add(Vanderhorn);

        Student tamasha = new Student(1,"tamasha", 4);
        Student rakshit = new Student(2, "rakshit", 12);
        Student rabi = new Student(3, "rabii", 5);

        List<Student> studentList = new ArrayList<>();
        studentList.add(tamasha);
        studentList.add(rakshit);
        studentList.add(rabi);

        School ghs = new School(teacherList, studentList);
        System.out.println("GHS has earned $" + ghs.getTotalMoneyEarned());
//
        tamasha.payFees(5000);
        System.out.println("GHS has earned $" + ghs.getTotalMoneyEarned());

        rakshit.payFees(6000);
        System.out.println("GHS has earned $" + ghs.getTotalMoneyEarned());

        System.out.println("......making school pay salary.......");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("GHS has spent for salary to " + lizzy.getName() + " and now has " + ghs.getTotalMoneyEarned());

        Vanderhorn.receiveSalary(Vanderhorn.getSalary());
        System.out.println("GHS has spent for salary to " + Vanderhorn.getName() + " and now has " + ghs.getTotalMoneyEarned());

        System.out.println(rakshit);

        mellisa.receiveSalary(mellisa.getSalary());
        System.out.println(mellisa);

        }
    }
