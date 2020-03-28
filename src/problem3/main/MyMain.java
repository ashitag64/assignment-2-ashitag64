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
        int rollNo =  scanner.nextInt();
        String name = scanner.nextLine();
        int backLogCounter = scanner.nextInt();
        int appearingCounter = scanner.nextInt();
        Student student = new Student(rollNo, name, backLogCounter, appearingCounter);
        MyPriorityQueue myPriorityQueue = new MyPriorityQueue();
        myPriorityQueue.insert(student);
        System.out.println("Details of student as per the roll number,in ascending order: ");
        myPriorityQueue.print();
    }
}
