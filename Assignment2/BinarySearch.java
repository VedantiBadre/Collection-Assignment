package Assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {

	
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		l.add(1);
		l.add(4);
		l.add(10);
		l.add(20);
		l.add(3);
		
		int index=Collections.binarySearch(l, 10);
		System.out.println(index);
		
		index=Collections.binarySearch(l, 13);
		System.out.println(index);
		
	}
}