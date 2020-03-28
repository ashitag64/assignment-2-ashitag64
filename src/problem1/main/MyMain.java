/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree obj = new MyBinarySearchTree();
        obj.enQueue(5);
        obj.enQueue(1);
        obj.enQueue(10);
        obj.enQueue(4);
        obj.enQueue(6);
        System.out.println("ALL Left Nodes");
        obj.printLeftNode();
        System.out.println("Count of Nodes not having left node");
        obj.countNotLeft();
    }
}
