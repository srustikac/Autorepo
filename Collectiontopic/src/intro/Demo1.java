package intro;

import java.util.Vector;

public class Demo1 {
	public static void main(String[] args) {
		Vector l1=new Vector(3);
		System.out.println(l1.capacity());
		l1.add(10);
		l1.add(20.56);
		l1.add('A');
		l1.add("hello");
		System.out.println(l1.capacity());
	}

}
