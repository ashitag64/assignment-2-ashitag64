/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.node;
// to define node properties

import problem5.student.Student;

public class Node {

    //add fields to the node class
    private Student data;
    private Node next;

    //add constructor to initialise values to the fields
    public Node(Student data) {
        this.data = data;
        next = null;
    }

    //add getter methods for the fields
    public Student getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }
}
