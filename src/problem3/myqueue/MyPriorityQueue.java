/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;

import problem5.student.Student;
import problem3.node.Node;

public class MyPriorityQueue {

    //fields for MyPriorityQueue class
    Node front;
    Node rear;
    int size;

    //default constructor to initialise values to the fields
    public  MyPriorityQueue(){
        front = null;
        rear = null;
        size = 0;
    }

    //getter method to get value of size of queue
    public int getSize() {
        return size;
    }
}
