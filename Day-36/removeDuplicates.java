
class removeDuplicates {

    public class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void printdata() {
        Node temp = head;
        if (temp == null) {
            System.out.println("LL EMPTY");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        return;
    }

    public void removeduplicate() {
        if (head == null) {
            return;
        }

        Node temp = head;
        while (temp != null && temp.next != null) {
            if (temp.data == temp.next.data) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
    }

    public static void main(String args[]) {
        removeDuplicates ll = new removeDuplicates();
        ll.addFirst(3);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(1);
        ll.printdata();
        ll.removeduplicate();
        ll
                .printdata();

    }
}
