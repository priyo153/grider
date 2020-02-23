package grider;

public class Queue {
	
	int queue[];
	int front=0;
	int rear=0;
	int count=0;
	int size;
	
	
	Queue(int size){
		this.size=size;
		queue=new int[size];
	}
	
	public void enqueue(int n) {
		
		if(count==size) {
			throw new RuntimeException("overflow");
			
		}
		
		queue[rear]=n;
		rear=(rear+1)%size;
		count++;
		
		
	}
	
	public int dequeue() {
		
		if(front==rear && count !=size) {
			
			throw new RuntimeException("underflow");
		}
		
		int res= queue[front];
		front=(front+1)%size;
		count--;
		return res;
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		Queue q=new Queue(5);
		
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		q.enqueue(6);
		q.enqueue(7);
		
		
		while(q.count!=0) {
			System.out.println(q.dequeue());
		
		}
		
	}

}
