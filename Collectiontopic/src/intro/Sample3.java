package intro;

import java.util.ArrayList;

public class Sample3 
{
	public static void main(String[] args) {
		ArrayList l1=new ArrayList();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		ArrayList l2=new ArrayList();
		l2.add('A');
		l2.add('B');
		l2.add('C');
		System.out.println("**B4**");
		System.out.println(l1);
		System.out.println(l2);
		l1.addAll(l2);
		System.out.println("**A4**");
		System.out.println(l1);
		System.out.println(l2);

		}
}
