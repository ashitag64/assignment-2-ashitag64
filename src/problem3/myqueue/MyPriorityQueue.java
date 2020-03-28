/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;

import problem3.node.Node;
import problem5.student.Student;

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

    //isEmpty() method to check whether the queue is empty or not
    public boolean isEmpty(){
        boolean response = false;
        if(size == 0)
            response = true;
        return response;
    }

    //insert() method to insert values of student in queue on basis of roll no in ascending order
    public void insert(Student student){
        Node node = new Node(student);
        size++;
        if(isEmpty()){
            front = node;
            rear = node;
        }
        else {
            if (student.getRollNo() > rear.getStudent().getRollNo()) {
                rear.setNext(node);
                rear = node;
            }
            else{
                Node temp = front;
                Node prev = front;
                while (temp.getNext() != null){
                    if(student.getRollNo() > temp.getStudent().getRollNo()){
                        prev = temp;
                        temp = temp.getNext();
                    }
                    prev = node;
                    node.setNext(temp);
                }
            }
        }
    }

    //print() method to print all the elements of the queue
    public void print(){
        Node temp = front;
        while (temp.getNext() != null){
            System.out.println(temp.getStudent().toString());
            temp = temp.getNext();
        }
    }
}
