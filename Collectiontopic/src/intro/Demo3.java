package intro;

import java.util.PriorityQueue;

public class Demo3 {
	public static void main(String[] args) {
		PriorityQueue l1=new PriorityQueue();
		l1.add(10);
		l1.add(320);
		l1.add(5);
		l1.add(7);
		System.out.println(l1);
		System.out.println(l1.peek());
		System.out.println(l1);
		System.out.println(l1.peek());
		System.out.println(l1);
		System.out.println("**polling");
		System.out.println(l1.poll());
		System.out.println(l1);
		System.out.println(l1.poll());
		System.out.println(l1);
	}

}
