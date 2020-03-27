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

    private TreeNode root;

    //getter method for root field
    public TreeNode getRoot() {
        return root;
    }

    //insert method to add a data element in the tree
    public void insert(int data){
        TreeNode treeNode = new TreeNode(data);
        if(root != null){
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
                }
                else {
                    parent.setRightNode(treeNode);
                }
        }
        else {
            root = treeNode;
        }
    }

    //preOrderTraverse method to traverse tree in pre-order
    public void preOrderTraverse(TreeNode node){
        if(node != null) {
            System.out.print(node.getData() + " ");
            preOrderTraverse(node.getLeftNode());
            preOrderTraverse(node.getRightNode());
        }
    }

}
