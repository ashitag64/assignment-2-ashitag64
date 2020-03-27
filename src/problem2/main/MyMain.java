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
            myBinarySearchTree.insert(scanner.nextInt());
        }
    }
}
