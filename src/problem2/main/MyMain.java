/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;
// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree

import problem1.mybst.MyBinarySearchTree;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyBinarySearchTree myBinarySearchTree = new MyBinarySearchTree();
        System.out.println("Enter the number of elements to be inserted in the tree: ");
        int size = scanner.nextInt();
        System.out.println("Enter elements to be inserted in the tree: ");
        for (int i = 0; i < size; i++) {
            myBinarySearchTree.enQueue(scanner.nextInt());
        }
        System.out.println("Pre - Order Traversal: ");
        myBinarySearchTree.preOrder();
        System.out.println();
        System.out.println("Post - Order Traversal: ");
        myBinarySearchTree.postOrder();
        System.out.println();
        System.out.println("Condition A: Root element is placed at opposite end, i.e. in pre order root is the first element where as in post order root is the last element is TRUE.");
        System.out.println("Condition B: They have common mid point, i.e. both the traversal will give same element at the mid position for odd number of nodes is FALSE.");
    }
}
