package grider;

public class Weave {

	public static Queue weave(Queue q1, Queue q2) {

		int q1size = q1.size;
		int q2size = q2.size;

		int q1count = 0;
		int q2count = 0;

		int size = q1size + q2size;
		Queue q3 = new Queue(size);

		int max = q1.size > q2.size ? q1.size : q2.size;

		for (int i = 0; i < size; i++) {
			if (q1count < q1size) {
				int val = q1.dequeue();
				q3.enqueue(val);
				q1count++;

			}

			if (q2count < q2size) {
				int val = q2.dequeue();
				q3.enqueue(val);
				q2count++;

			}

		}
		return q3;

	}

	public static void main(String[] args) {
		Queue q1 = new Queue(5);
		Queue q2 = new Queue(3);
		Queue q3;

		q1.enqueue(1);
		q1.enqueue(3);
		q1.enqueue(5);
		q1.enqueue(7);
		q1.enqueue(8);

		q2.enqueue(2);
		q2.enqueue(4);
		q2.enqueue(6);

		q3 = weave(q1, q2);

		for (int i = 0; i < q3.size; i++) {

			System.out.println(q3.dequeue());

		}

	}

}
