import java.util.Scanner;

class Source {

   static Node headNode;

   /* Structure of the node of linked list */
   static class Node {

       /* data of the node*/
       int data;

       /* This is used to point the next node of
       the currNode node */
       Node next;

       Node(int value) {
           data = value;
           next = null;
       }
   }

   /* This method does the following:
   1. If there is a loop in the linked list, it should print 'Yes'
   and remove the loop in the linked list and return the head node.
   2. If there is no loop in the linked list, it should print 'No'
   and return the head node of the linked list. */
   
   void removeLoop(Node loop, Node curr)
    {
        Node ptr1 = null, ptr2 = null;
        ptr1 = curr;
        while (1 == 1) {
            ptr2 = loop;
            while (ptr2.next != loop && ptr2.next != ptr1) {
                ptr2 = ptr2.next;
            }
            if (ptr2.next == ptr1) {
				System.out.println("Yes");
                break;
            }
            ptr1 = ptr1.next;
        }
        ptr2.next = null;
    }
	
   Node removeLoop(Node head) {
       Node slow = head, fast = head;
        while (slow != null && fast != null && fast.next != null) {
				slow = slow.next;
				fast = fast.next.next;
				if (fast == null){
					System.out.println("No");
					break;
				}
				if (slow == fast) {
					removeLoop(slow,head);
				}
        }	
		
		while (head != null) {
           System.out.print(head.data + " ");
            head = head.next;
        }
       return head;
   }

   /* This method adds a new node with data 'newData' to
   the front of the linked list*/
   public void addAtHead(int newData) {

       /* Create a new Node of data newData */
       Node newNode = new Node(newData);

       /* Now, set the next of the newNode as headNode */
       newNode.next = headNode;

       /* Next, make this newNode as head*/
       headNode = newNode;
   }


   /* This method prints every node of the linked list from the head,
   separating by a space */
   void printLinkedList(Node head) {
       Node tempNode = head;
       while (tempNode != null) {
           System.out.print(tempNode.data + " ");
           tempNode = tempNode.next;
       }
   }


   // Driver program to test above functions
   public static void main(String[] args) {
       Source list = new Source();

       Scanner in = new Scanner(System.in);

       /* Get the number of nodes of the linked list from input */
       int n = in.nextInt();

       /* Get all nodes of the linked list from input */
       for (int i = 0; i < n; i++) {
           list.addAtHead(in.nextInt());
       }

       /* Get the value of k from input */
       int k = in.nextInt();

       /* Creating a loop, by making the next node of the last node
        as the kth node from the head of the linked list */
       if (k != 0) {
           Node first = headNode, last;
           for (int i = 0; i < k; i++) {
               first = first.next;
           }
           last = first;
           while (last.next != null) {
               last = last.next;
           }
           last.next = first;
       }

       /* Print the linked list after removing the loop */
       list.printLinkedList(list.removeLoop(headNode));
   }
}
