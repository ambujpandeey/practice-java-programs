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
	private Node head;

	public LinkedList() {
		this.head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void append(int data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			head = newNode;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
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
