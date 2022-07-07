package intro;

import java.util.ArrayList;

public class Sample2 
{
	public static void main(String[] args) {
		ArrayList l1=new ArrayList();
		l1.add(10);
		l1.add(20.56);
		l1.add('A');
		l1.add("hi");
		l1.add(null);
		System.out.println(l1);
		l1.add(1,true);
		System.out.println(l1);
		
	}
}
