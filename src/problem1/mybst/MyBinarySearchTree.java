/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;


import problem1.node.TreeNode;
// to implement BinarySearchTree
public class MyBinarySearchTree {

    int count;
    //add fields to MyBinarySearchTree class
    private TreeNode root;

    //default constructor
    public MyBinarySearchTree() {
        root = null;
        count = 0;
    }

    //getter method for root field
    public TreeNode getRoot() {
        return root;
    }

    //enQueue method to add a data element in the tree
    public void enQueue(int data) {
        TreeNode treeNode = new TreeNode(data);
        if (root != null) {
            TreeNode temp = root;
            TreeNode parent = null;
            while ((temp != null)) {
                parent = temp;
                if (data <= temp.getData()) {
                    temp = temp.getLeftNode();
                } else {
                    temp = temp.getRightNode();
                }
            }
                if (data <= parent.getData()) {
                    parent.setLeftNode(treeNode);
                } else {
                    parent.setRightNode(treeNode);
                }
        } else {
            root = treeNode;
        }
    }

    private void LeftNode(TreeNode root) {
        if (root == null)
            return;
        else {
            if (root.getLeftNode() != null)
                System.out.println(root.getLeftNode().getData());
            else
                count++;
            LeftNode(root.getLeftNode());
            LeftNode(root.getRightNode());
        }
    }

    public void printLeftNode() {
        LeftNode(root);
    }

    public void countNotLeft() {
        System.out.println(count);
    }

    //preOrder() method called for pre-order traversal
    public void preOrder() {
        preOrderTraverse(root);
    }

    //preOrderTraverse method to traverse tree in pre-order
    public void preOrderTraverse(TreeNode node) {
        if (node != null) {
            System.out.print(node.getData() + " ");
            preOrderTraverse(node.getLeftNode());
            preOrderTraverse(node.getRightNode());
        }
    }

    //postOrderTraverse method to traverse tree in post-order
    public void postOrder(){
        postOrderTraverse(root);
    }

    //postOrderTraverse method to traverse tree in post-order
    public void postOrderTraverse(TreeNode node){
        if(node != null){
            postOrderTraverse(node.getLeftNode());
            postOrderTraverse(node.getRightNode());
            System.out.print(node.getData() + " ");
        }
    }
}