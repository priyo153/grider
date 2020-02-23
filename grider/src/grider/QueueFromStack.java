package grider;

public class QueueFromStack {
	Stack s1;
	Stack s2;
	
	
	int size;
	int count=0;
	
	QueueFromStack(int size){
		this.size=size;
		 s1=new Stack(size);
		 s2=new Stack(size);
	}
	
	void enqueue(int n){
		s1.push(n);
		count++;

		
		
	}
	
	int dequeue() {
		while(s1.top!=0) {
			s2.push(s1.pop());
		}
		
		int val= s2.pop();
		
		while(s2.top!=0) {
			s1.push(s2.pop());
		}
		
		count--;
		
		return val;
	}
	
	public static void main(String[] args) {
		
		QueueFromStack q=new QueueFromStack(5);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		
		
		


		while(q.count!=0) {
			
			System.out.println(q.dequeue());
			
		}
		
	}

}
