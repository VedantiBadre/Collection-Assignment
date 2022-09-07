package Assignmnet1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSort {

	public static void main(String[] args) {
		
		List l=new ArrayList();
		l.add(10);
		l.add(40);
		l.add(30);
		l.add(90);
		l.add(20);
		
		Collections.sort(l);
		
	    System.out.println(l);

	}

}
