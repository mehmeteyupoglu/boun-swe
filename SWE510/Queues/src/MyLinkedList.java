public class MyLinkedList {
    Node head;

    public void dequeue(){
        if(head == null) return;

        Node current = head;

        head = current.next;
    }

    public void enqueue(int x){
        Node new_node = new Node(x);
        Node current = head;

        if(head == null){
            head = new_node;
            return;
        }

        new_node.next = null;

        while(current.next != null){
            current = current.next;
        }

        current.next = new_node;
    }

    public void renderLL(){
        if(head == null){
            System.out.println("Nothing to show");
            return;
        }

        Node current = head;

        while(current != null){
            System.out.println("current data: " + current.data);
            current = current.next;
        }
    }
}
