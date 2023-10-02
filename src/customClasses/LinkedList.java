package customClasses;

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class LinkedList {
	private Node head; // assumed

	public LinkedList() {
		this.head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	/*
	 * 
	 * The append(int data) method is responsible for adding a new node with the
	 * given data at the end of the linked list. Here's a detailed explanation of
	 * how it works:
	 * 
	 * It starts by creating a new node using the Node class. The data parameter
	 * passed to the method is assigned to the data field of the new node. The next
	 * field is set to null since the new node will be added at the end of the list.
	 * 
	 * The method then checks if the linked list is empty by calling the isEmpty()
	 * method. If the list is empty, it means there are no existing nodes, so the
	 * head of the list is assigned to the new node, making it the first and only
	 * node in the list.
	 * 
	 * If the list is not empty, it means there are existing nodes. In this case, a
	 * reference to the head node is stored in the current variable for traversing
	 * the list.
	 * 
	 * A while loop is used to iterate through the list until the last node is
	 * reached. The loop condition checks if the next field of the current node is
	 * null, indicating that it is the last node in the list.
	 * 
	 * Inside the loop, the current reference is updated to the next node in each
	 * iteration, moving towards the end of the list.
	 * 
	 * Once the last node is reached, the next field of that node is assigned to the
	 * new node created in step 1. This effectively adds the new node at the end of
	 * the list.
	 * 
	 * The method ends after appending the new node to the list.
	 * 
	 * To summarize, the append() method adds a new node with the given data at the
	 * end of the linked list. If the list is empty, the new node becomes the head.
	 * If the list is not empty, the method traverses the list to find the last node
	 * and adds the new node after it.
	 * 
	 */

	public void append(int data) {
		Node newNode = new Node(data);// The next field is set to null since the new node will be added at the end of
										// the list.
		if (isEmpty()) {
			/*
			 * The method then checks if the linked list is empty by calling the isEmpty()
			 * method. If the list is empty, it means there are no existing nodes, so the
			 * head of the list is assigned to the new node, making it the first and only
			 * node in the list.
			 */
			head = newNode;
		} else {
			/*
			 * If the list is not empty, it means there are existing nodes. In this case, a
			 * reference to the head node is stored in the current variable for traversing
			 * the list.
			 */
			Node current = head;
			while (current.next != null) {
				/*
				 * A while loop is used to iterate through the list until the last node is
				 * reached. The loop condition checks if the next field of the current node is
				 * null, indicating that it is the last node in the list.
				 */
				current = current.next;
				/*
				 * Inside the loop, the current reference is updated to the next node in each
				 * iteration, moving towards the end of the list.
				 */
			}
			current.next = newNode;
			System.out.println("dddd");
		}
	}

	public void prepend(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	public void insertAfter(int targetData, int data) {
		Node newNode = new Node(data);
		Node current = head;
		while (current != null) {
			if (current.data == targetData) {
				newNode.next = current.next;
				current.next = newNode;
				break;
			}
			current = current.next;
		}
	}

	public void delete(int data) {
		if (isEmpty()) {
			return;
		}

		if (head.data == data) {
			head = head.next;
			return;
		}

		Node current = head;
		while (current.next != null) {
			if (current.next.data == data) {
				current.next = current.next.next;
				break;
			}
			current = current.next;
		}
	}

	public void display() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.append(5);
		linkedList.append(10);
		linkedList.append(34);
		linkedList.append(55);
		linkedList.append(66);
		linkedList.append(44);
		linkedList.append(68);
		linkedList.append(99);
		linkedList.append(987);
		linkedList.append(65433);
		linkedList.append(34543);
		linkedList.append(7567);
		linkedList.append(786857);
		linkedList.append(534432);
		linkedList.append(75657);
		linkedList.append(67687);
		linkedList.prepend(3);
		linkedList.insertAfter(5, 7);
		linkedList.delete(10);
		linkedList.display();
	}
}
