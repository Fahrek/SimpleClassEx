package com.company;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("=====================================");
        System.out.println("  Welcome to SoloLearn Academy SYS:  ");
        System.out.println("=====================================");

        System.out.print("How many students do you want to register?: ");
        Student[] vStudents = new Student[sc.nextInt()];

        IntStream.range(0, vStudents.length).forEach(i -> {
            System.out.print("Enter the name: ");
            String n = sc.next();
            System.out.print("How many notes do you want to enter?: ");
            int notesQTY = sc.nextInt();
            Student s = new Student(n, notesQTY);
            s.insertNotes();
            vStudents[i] = s;
        });

        for (Student vStudent : vStudents) {
            vStudent.showNotes();
        }
    }
}

