/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.node;

import problem5.student.Student;

public class Node {

    //add two fields in node class
    private Student student;
    private Node next;

    //add getter methods for the fields
    public Student getStudent() {
        return student;
    }

    public Node getNext() {
        return next;
    }

    // //add setter methods for the fields
    public void setStudent(Student student) {
        this.student = student;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
