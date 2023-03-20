public class LlistImplementation {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList();
        System.out.println("top item: " + myLinkedList.top());

        for (int i = 0; i < 8; i++)
            myLinkedList.push(i);

        System.out.println(myLinkedList.pop());
        System.out.println(myLinkedList.pop());

        System.out.println("top item: " + myLinkedList.top());

        myLinkedList.renderLl();
    }
}
