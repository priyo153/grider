package grider;

public class DetectCircularList {
	
	static boolean detectCircularList(LinkedList lst) {
		
		Node slow=lst.getFirst();
		Node fast=lst.getFirst();
		
		while(fast.next!=null && fast.next.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			
			if(slow==fast) {
				return true;
			}
			
		}
		return false;
		
		
	}
	
	
	public static void main(String[] args) {
		LinkedList lst=new LinkedList();
		lst.insertLast(0);
//		lst.insertLast(1);
//		lst.insertLast(2);
//		lst.insertLast(3);
//		lst.insertLast(4);
//		lst.insertLast(5);
		Node other=lst.getAt(0);
		Node last=lst.getlast();
		last.next=other;
		
		
		System.out.println("loop detected "+detectCircularList(lst));
		
		
		
	}

}
