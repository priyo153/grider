package grider;

class Node {

	int data;
	Node next = null;

	Node(int val) {
		data = val;
	}

	Node(int val, Node addr) {
		data = val;
		next = addr;
	}
}

public class LinkedList {

	Node head;

	LinkedList() {
		head = new Node(0);
	}

	void insertFirst(int val) {

//		Node temp = new Node(val, head.next);
//		head.next = temp;
		
		insertAt(val,0);
	}

	void traverse() {

		Node current = head.next;
		if (current == null) {
			System.out.println("empty linked list");
			return;
		}
		System.out.println("-------------");
		while (current != null) {

			System.out.println(current.data);
			current = current.next;
		}
		System.out.println("*************");
	}

	int size() {

		Node current = head.next;
		int counter = 0;

		while (current != null) {

			counter++;
			current = current.next;
		}

		return counter;
	}

	Node getFirst() {
//		if (head.next == null) {
//			throw new RuntimeException("empty linked List");
//		}
//		return head.next;
		
		return getAt(0);
	}

	Node getlast() {

//		Node current = head;
//
//		while (current.next != null) {
//
//			current = current.next;
//		}
//
//		return current;
		
		return getAt(size()-1);

	}

	void clear() {
		head.next = null;
	}

	void removeFirst() {
//		if (head.next == null) {
//			throw new RuntimeException("empty linked List");
//		}
//		head.next = head.next.next;
//	}
		removeAt(0);
	}
		

	void removeLast() {
//		Node current = head;
//		if (current.next == null) {
//			throw new RuntimeException("empty linked List");
//		}
//
//		while (current.next.next != null) {
//			current = current.next;
//		}
//
//		current.next = null;
		
		removeAt(size()-1);
	}

	void insertLast(int val) {
//		Node current = getlast();
//
//		current.next = new Node(val);
		
		insertAt(val,size());

	}

	Node getAt(int index) {

		Node current = head;
	
		int counter = -1;
		
		if (index<-1) {
			throw new RuntimeException("invalid index");
		}
		if (current.next == null) {
			throw new RuntimeException("empty linked List");
		}

		while (counter < index) {
			
			if (current.next == null ) {
				throw new RuntimeException("out of list bounds");
			}
			
			current = current.next;
			counter++;
		}
		
		return current;

	}
	
	
	
	void removeAt(int index) {

		Node prev=getAt(index-1);
		prev.next=prev.next.next;
	
	}
	
	
	Node getAtNoErrors(int index) {

		Node current = head;
	
		int counter = -1;
		
		if (index<-1) {
			index=-1;
		}
		

		while (counter < index) {
			
			if (current.next == null ) {
				break;
			}
			
			current = current.next;
			counter++;
		}
		
		return current;

	}
	
	
	void insertAt(int data, int index) {
		
		Node prev=getAtNoErrors(index-1);
		Node current=new Node(data,prev.next);
		prev.next=current;
	}

	public static void main(String[] args) {

		LinkedList lst = new LinkedList();
		lst.insertFirst(1);
		lst.insertFirst(2);
//		lst.insertFirst(3);
//		lst.insertFirst(4);
//		lst.insertFirst(5);
//		lst.insertFirst(6);

		lst.traverse();
		System.out.println("size is " + lst.size());
		System.out.println("first " + lst.getFirst().data);
		System.out.println("last " + lst.getlast().data);

		lst.removeFirst();

		lst.traverse();
		lst.removeLast();
		lst.traverse();
		lst.clear();
		System.out.println("size is " + lst.size());
		lst.insertLast(1);
		lst.insertLast(2);
		lst.insertLast(3);
		lst.insertLast(4);
		lst.insertLast(5);
		lst.traverse();
		System.out.println();

	
		System.out.println("size is * " + lst.size());
		System.out.println(lst.getAt(0).data);
		System.out.println(lst.getAt(1).data);
		System.out.println(lst.getAt(4).data);
		lst.traverse();
		lst.removeAt(4);
		lst.removeAt(1);
		lst.removeAt(0);
		lst.removeAt(0);
		lst.removeAt(0);
		
		
		lst.traverse();
		
		lst.insertAt(1, 5);
		lst.insertAt(1, 5);
		lst.insertAt(2, 1);
		lst.insertAt(3, 2);
		lst.insertAt(0, 0);
		lst.insertAt(-1, -1);
		
		
		lst.traverse();
		

	}

}