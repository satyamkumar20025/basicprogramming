package java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>n = new ArrayList();
		n.add(54);
		n.add(55);
		n.add(45);
		n.add(23);
		n.add(89);
		n.add(55);
		n.add(512);
		n.add(532);
		n.add(3);
		n.add(53);
		n.add(2);
		
		Collections.sort(n,(a,b)-> a-b);
		System.out.println("Sorting list is"+n);

	}

}
