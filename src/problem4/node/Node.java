package problem4.node;

public class Node {

    //add fields in node class
    private int data;
    private Node next;

    //add constructor to initialise values to the fields
    public Node(int data) {
        this.data = data;
        next = null;
    }

    //add getter methods for the fields
    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    //add setter methods for the fields
    public void setData(int data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
