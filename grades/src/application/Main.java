package application;

import entities.Student;
import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("---------------------");
        System.out.println("Grades - Class 3A");
        System.out.println("---------------------");
        
        System.out.print("How many students you want to check the average? ");
        int n = sc.nextInt();
        
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Student> approvedStudents = new ArrayList<>();
        
        System.out.println();
        
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.print("Insert the name of the student: ");
            String name = sc.nextLine();
            System.out.print("Insert the 1st grade of the student: ");
            double grade1 = sc.nextDouble();
            System.out.print("Insert the 2nd grade of the student: ");
            double grade2 = sc.nextDouble();
            students.add(new Student(name, grade1, grade2));
            System.out.println();
        } 
        
        for (Student student : students) {
            double grade1 = student.getGrade1();
            double grade2 = student.getGrade2();
            
            if (student.media(grade1, grade2) >= 6) {
                approvedStudents.add(student);
            }
        }
        
        System.out.printf("Approved students (Average >= 6):\n");
        
        for (Student student : approvedStudents) {
        	System.out.println(student);
        }
        
        sc.close();
    }

}

