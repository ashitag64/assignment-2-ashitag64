/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.circularqueue;

import problem5.node.Node;

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


}
