public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        for (int i = 0; i < 8; i++) {
            list.append(i);
        }

        list.remove(4);

        renderLinkedList(list);
    }

    public static void renderLinkedList(MyLinkedList list){
        Node current = list.head;

        while(current.next != null){
            System.out.println(current.data);
            current = current.next;
        }

        System.out.println(current.data);

        System.out.println("list rendered...");
    }
}

class MyLinkedList {
    Node head;

    public void push(int x){
        Node new_node = new Node(x);
        new_node.next = head;
        head = new_node;
    }

    public void append(int x){
        Node current = head;
        Node new_node = new Node(x);
//        System.out.println(x);

        if(head == null){
            head = new_node;
            return;
        }

        new_node.next = null;

        while((current.next != null)){
            current = current.next;
        }

        current.next = new_node;
    }

    public void remove(int key){
        Node current = head, prev = null;

        if(current != null & current.data != key){
            head = head.next;
            return;
        }

        while(current != null && current.data != key){
            prev = current;
            current = current.next;
        }

        if(current == null)
            return;

        prev.next = current.next;
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