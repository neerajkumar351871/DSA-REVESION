
public class ReverseLinklist {

    public static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public static void push(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // REVERSE
    public void reverse() {
        Node prev = null;
        Node curr = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // Print
    public void printLinkedList() {
        if (head == null) {
            System.out.println("Linked List is Empty!");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Size
    public int size() {
        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
// FIND & REMOVE NTH NODE FROM  END.

    public int deletefromlast(int idx) {
        Node prev = head;
        for (int i = 1; i < (size() - idx + 1); i++) {
            prev = prev.next;
        }
        return prev.data;
    }

    public static void main(String args[]) {
        ReverseLinklist obj = new ReverseLinklist();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);

        // obj.printLinkedList();
        obj.reverse();
        obj.printLinkedList();
        obj.size();
        System.out.println(obj.deletefromlast(3));
    }
}
