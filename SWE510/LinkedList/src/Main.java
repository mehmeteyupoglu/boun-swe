public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        MyLinkedList list = new MyLinkedList();
    }
}

class MyLinkedList {
    Node head;
}

class Node {
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}