package com.company;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Student
{
    private String name;
    private float[] vNotes;

    public Student(String name, int quantity)
    {
        this.name = name;
        vNotes = new float[quantity];
    }

    private String getName()
    {
        return name;
    }

    public void insertNotes()
    {
        Scanner kb = new Scanner(System.in);

        for (int i = 0; i < vNotes.length; i++)
        {
            System.out.print("Note " + (i+1) + ": ");
            vNotes[i] = kb.nextFloat();
        }

    }

    private float getAverage()
    {
        float sum = 0;
        for (float vNote : vNotes)
        {
            sum += vNote;
        }
        float avg = sum / vNotes.length;
        return avg;
    }

    public void showNotes()
    {
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        df.setRoundingMode(RoundingMode.CEILING);

        System.out.println("--------------------------------------------");
        System.out.println("  NOTES REPORT FROM " + "[" + getName() + "]");
        System.out.println("--------------------------------------------");

        for (float vNote : vNotes)
        {
            System.out.println(vNote);
        }

        System.out.println("AVERAGE --> " + df.format(getAverage()));
        System.out.println("--------------------------------------------");
    }
}

