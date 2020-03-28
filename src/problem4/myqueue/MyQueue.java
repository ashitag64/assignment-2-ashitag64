/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:11 PM
 */
package problem4.myqueue;
// to create queue to store pre - order successor

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;
import problem4.node.Node;

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

    //isEmpty() method to check whether the queue is empty or not
    public boolean isEmpty() {
        boolean response = false;
        if (size == 0)
            response = true;
        return response;
    }

    //insert() method to store pre - order successor of all the nodes of given binary search tree.
    public void insert(int data) {
        Node node = new Node(data);
        size++;
        if (isEmpty()) {
            front = node;
        } else {
            rear.setNext(node);
        }
        rear = node;
    }

    //preOrderTraverse method to traverse tree in pre-order
    public void preOrderTraverse(TreeNode node) {
        if (node != null) {
            insert(node.getData());
            preOrderTraverse(node.getLeftNode());
            preOrderTraverse(node.getRightNode());
        }
    }

    //method to provide root node to access the tree in pre-order
    public void addData(MyBinarySearchTree tree) {
        preOrderTraverse(tree.getRoot());
    }

    //print() method to print all the elements of the queue
    public void print() {
        Node temp = front;
        while (temp.getNext() != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
        System.out.print(temp.getData());
    }
}
