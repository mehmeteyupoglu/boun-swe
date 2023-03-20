public class LinkedList {
    Node head = null;

    public void renderLl(){
        Node current = head;

        if(head == null)
            System.out.println("List is empty ");

        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }

    public void push(int x){
        Node current = head;
        Node new_node = new Node(x);

        if(head == null){
            head = new_node;
            return;
        }

        while(current.next != null){
            current = current.next;
        }

        current.next = new_node;
    }

    public int pop(){
        if(head == null) throw new RuntimeException("Underflow");

        Node current = head, prev = null;

        while(current.next != null){
            prev = current;
            current = current.next;
        }

        prev.next = null;
        return current.data;
    }

    public int top(){
        Node current = head;

        if(head == null){
            throw new RuntimeException("list is empty");
        }

        while(current.next != null){
            current = current.next;
        }

        return current.data;
    }

    public void makeEmpty(){
        head = null;
    }
}
