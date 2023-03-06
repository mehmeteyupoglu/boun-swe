public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
    }
}

class MyLinkedList {
    Node head;

    public void push(int x){
        Node new_node = new Node(x);
        head = new_node;
        new_node.next = head;
    }
}

class Node {
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}