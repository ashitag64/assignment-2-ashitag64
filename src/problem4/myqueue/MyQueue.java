/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:11 PM
 */
package problem4.myqueue;
// to create queue to store pre - order successor

import problem3.node.Node;

public class MyQueue {

    //fields for MyQueue class
    Node front;
    Node rear;
    int size;

    //getter method to get value of size of queue
    public int getSize() {
        return size;
    }

    //default constructor to initialise values to the fields
    public MyQueue() {
        front = null;
        rear = null;
        size = 0;
    }
}
