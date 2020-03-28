/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;
// executable class
// use problem5.student.Student class to create object of student
import problem3.myqueue.MyPriorityQueue;
import problem5.student.Student;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyPriorityQueue myPriorityQueue = new MyPriorityQueue();
        System.out.println("enter the no of students whose details you want to add: ");
        int size = scanner.nextInt();
        System.out.println("Enter details of student: ");
        for (int i = 0; i < size; i++) {
            System.out.println("Enter rollNo: ");
            int rollNo = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter name: ");
            String name = scanner.nextLine();
            myPriorityQueue.enQueue(new Student(rollNo, name, 0, 0));
        }
        System.out.println("Details of student as per the roll number, in ascending order: ");
        myPriorityQueue.print();
    }
}
