import java.util.*;
class Sourcereverse { 
    Node head;
    static Node temp;
    class Node { 
        int data;
        Node next;
        Node(int d) { 
            data = d;
            next = null; 
        }
    }
    
    public void push(int new_data) {
        Node temp = head;
        Node new_node = new Node(new_data);
        if (head == null) {
            head = new_node;
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new_node;
        }
    }
		public void insertfront(int data)
		{
			Node new_node = new Node(data);
			new_node.next = head;
			head = new_node;
			//return head;
		}
		
		public void deletefront(int data)
		{
			Node new_node = new Node(data);
			Node temp = head;
			head = head.next;
			//return head;
		}

    /*This method is just responsible for reversing, whatever be the input node. It will start to treat the input node as the starting node and will start to reverse the list from there */
    Node recursiveReverse(Node current, Node prev) {
      //write your code here 
		if (current == null)
            return head;
        if (current.next == null) {
            head = current;
            current.next = prev;
            return head;
        }
        Node next1 = current.next;
        current.next = prev;
        //recursiveReverse(next1, current);
        return recursiveReverse(next1, current);
    }
    /* This function prints contents of linked list
    starting from the head node */
    public void print() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Sourcereverse obj = new Sourcereverse();
        int no = in.nextInt();
        for (int i = 0; i < no; i++) {
            obj.push(in.nextInt());
        }
        obj.recursiveReverse(obj.head, null);
        obj.print();
    }
}