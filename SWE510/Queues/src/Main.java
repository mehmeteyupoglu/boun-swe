public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();

        for (int i = 0; i < 8; i++) {
            myLinkedList.enqueue(i);
        }

        for (int i = 0; i < 3; i++) {
            myLinkedList.dequeue();
        }

        myLinkedList.renderLL();
    }
}