/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.circularqueue;

import problem5.node.Node;
import problem5.student.Student;

//to implement circular queue
public class MyCircularQueue {

    //add fields to the MyCircularQueue class
    Node front;
    Node rear;
    int size;

    //default constructor to initialise values to the fields
    public MyCircularQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    //isEmpty() method to check whether the queue is empty or not
    boolean isEmpty() {
        boolean response = false;
        if (front == null) {
            response = true;
        }
        return response;
    }

    //add insert() method to enter values in the queue
    public void insert(Student element) {
        Node node = new Node(element);
        size++;

        if (isEmpty()) {
            front = node;
            rear = node;
            rear.setNext(front);
        } else {
            rear.setNext(node);
            rear = node;
            rear.setNext(front);
        }
    }


}
