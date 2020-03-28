/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:08 PM
 */
package problem4.main;

import problem1.mybst.MyBinarySearchTree;
import problem4.myqueue.MyQueue;

import java.util.Scanner;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree

public class MyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyBinarySearchTree myBinarySearchTree = new MyBinarySearchTree();
        System.out.println("Enter the number of values to be inserted: ");
        int size = scanner.nextInt();
        System.out.println("Enter values to be inserted: ");
        for (int i = 0; i < size; i++) {
            myBinarySearchTree.insert(scanner.nextInt());
        }
        System.out.println("TREE PREORDER:");
        myBinarySearchTree.preOrder();
        System.out.println();
        MyQueue myQueue = new MyQueue();
        myQueue.addData(myBinarySearchTree);
        System.out.println("QUEUE DISPLAY:");
        myQueue.print();
    }
}
