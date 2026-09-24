package CollectionPrgm;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Priority_Queue {
	public static void main(String[] args) {
		
		Queue q=new PriorityQueue();
		q.add(2);
		q.add(1);
		q.add(4);
		q.add(3);
		//q.add(null);
		
		//System.out.println(q.peek());
		
		//System.out.println(q.poll());
		
		//q.remove();
		//q.remove();
		//q.remove();
		
		//System.out.println(q.poll());
		
		System.out.println(q.size());
		
		q.clear();
		
		System.out.println(q);
	}

}
