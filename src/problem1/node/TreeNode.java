/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.node;

public class TreeNode {

    //fields for node class
    private int data;
    private TreeNode leftNode;
    private  TreeNode rightNode;

    //constructor for node class
    public TreeNode(int data){
        this.data = data;
        leftNode = null;
        rightNode = null;
    }

    //getter methods for the fields
    public int getData() {
        return data;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    //setter methods for the fields
    public void setData(int data) {
        this.data = data;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }
}

