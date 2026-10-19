
public class LinkedList {

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

    // Add First
    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // Print LinkedList
    public void printlinkedList() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Detect Cycle
    public boolean detectloop() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    // Remove Cycle
    public void removecycle() {
        Node slow = head;
        Node fast = head;
        boolean flag = false;

        // Step 1: Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                flag = true;
                break;
            }
        }

        // No cycle
        if (!flag) {
            return;
        }

        // Step 2: Find cycle starting point
        slow = head;

        // Special case: cycle starts at head
        if (slow == fast) {
            while (fast.next != slow) {
                fast = fast.next;
            }

            fast.next = null;
            return;
        }

        // General case
        Node prev = null;

        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // Step 3: Break cycle
        prev.next = null;
    }

    public static void main(String args[]) {
        LinkedList ll = new LinkedList();

        // Create a cycle: 1 -> 2 -> 3 -> 1
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;

        // Detect cycle
        if (ll.detectloop()) {
            System.out.println("CYCLE ARE DETECT..");
        } else {
            System.out.println("CYCLE ARE NOT DETECT....");
        }

        // Remove cycle
        ll.removecycle();

        // Check again
        if (ll.detectloop()) {
            System.out.println("CYCLE ARE DETECT..");
        } else {
            System.out.println("CYCLE ARE NOT DETECT....");
        }

        // Print after removing cycle
        ll.printlinkedList();
    }
}

public class LinkedList {

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

    // Add First
    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // Print LinkedList
    public void printlinkedList() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Detect Cycle
    public boolean detectloop() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    // Remove Cycle
    public void removecycle() {
        Node slow = head;
        Node fast = head;
        boolean flag = false;

        // Step 1: Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                flag = true;
                break;
            }
        }

        // No cycle
        if (!flag) {
            return;
        }

        // Step 2: Find cycle starting point
        slow = head;

        // Special case: cycle starts at head
        if (slow == fast) {
            while (fast.next != slow) {
                fast = fast.next;
            }

            fast.next = null;
            return;
        }

        // General case
        Node prev = null;

        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // Step 3: Break cycle
        prev.next = null;
    }

    public static void main(String args[]) {
        LinkedList ll = new LinkedList();

        // Create a cycle: 1 -> 2 -> 3 -> 1
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;

        // Detect cycle
        if (ll.detectloop()) {
            System.out.println("CYCLE ARE DETECT..");
        } else {
            System.out.println("CYCLE ARE NOT DETECT....");
        }

        // Remove cycle
        ll.removecycle();

        // Check again
        if (ll.detectloop()) {
            System.out.println("CYCLE ARE DETECT..");
        } else {
            System.out.println("CYCLE ARE NOT DETECT....");
        }

        // Print after removing cycle
        ll.printlinkedList();
    }
}
