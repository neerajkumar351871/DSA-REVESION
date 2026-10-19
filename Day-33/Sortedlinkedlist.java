
class Sortedlinkedlist {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;

    // FIND MIDDLE
    private Node getmid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // MERGE TWO SORTED LINKED LISTS
    private Node merge(Node list1, Node list2) {
            Node mergedll = new Node(-1);
            Node temp = mergedll;

            while (list1 != null && list2 != null) {
                if (list1.data <= list2.data) {
                    temp.next = list1;
                    list1 = list1.next;
                } else {
                    temp.next = list2;
                    list2 = list2.next;
                }

                temp = temp.next;
            }

            // LEFT REMAINING ELEMENTS
            while (list1 != null) {
                temp.next = list1;
                list1 = list1.next;
                temp = temp.next;
            }

            // RIGHT REMAINING ELEMENTS
            while (list2 != null) {
                temp.next = list2;
                list2 = list2.next;
                temp = temp.next;
            }

            return mergedll.next;
    }

    // MERGE SORT
    public Node mergSort(Node head) {

        // BASE CASE
        if (head == null || head.next == null) {
            return head;
        }

        // FIND MIDDLE
        Node mid = getmid(head);

        // DIVIDE INTO TWO PARTS
        Node righthead = mid.next;
        mid.next = null;

        // SORT LEFT AND RIGHT PARTS
        Node newLeftpart = mergSort(head);
        Node newRightpart = mergSort(righthead);

        // MERGE BOTH SORTED PARTS
        return merge(newLeftpart, newRightpart);
    }

    // PRINT LINKED LIST
    public void print() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String args[]) {
        Sortedlinkedlist ll = new Sortedlinkedlist();

        ll.head = new Node(5);
        ll.head.next = new Node(4);
        ll.head.next.next = new Node(3);
        ll.head.next.next.next = new Node(2);
        ll.head.next.next.next.next = new Node(1);

        System.out.println("Before Sorting:");
        ll.print();

        ll.head = ll.mergSort(ll.head);

        System.out.println("After Sorting:");
        ll.print();
    }
}
