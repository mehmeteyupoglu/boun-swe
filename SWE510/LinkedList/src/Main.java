public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        System.out.println(list.head);
        for (int i = 0; i < 4; i++) {
            list.append(i);
        }

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
}

class Node {
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}