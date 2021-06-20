import java.util.*;

public class Source {
    //Node with data variable and next
    class Node {
        int data;
        Node next;

        Node(int value) {
            data = value;
            next = null;
        }
    }

    //initialising head node 'head' to null
    public static Node head = null;
    
    public static Node last;

    //method to add the node at the end of the linked list
    public void add(int value) {
        // Assume head is the head of the linked list
        Node newNode = new Node(value);
        //if the linked list is empty then
        if (head == null) {
            head = new Node(value);
            return;
        }

        last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
        return;
    }
    //Method to print the middle element of the linked list
    public static void printMiddleElement(Node head) {
     //write your code here
	if(head==null){
		 return;
	 }else{

		Node slow = head;
        Node fast = head;
        if (head != null)
        {
            while (fast != null && fast.next != null)
            {
                fast = fast.next.next;
                slow = slow.next;
            }
            System.out.println(slow.data);
        }
	 }
    }
public static void main(String[] arg) {
        Source obj = new Source();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            obj.add(in.nextInt());
        }
        printMiddleElement(obj.head);
    }
}