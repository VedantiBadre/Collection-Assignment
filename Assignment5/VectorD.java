package Assignment5;

import java.util.Collections;
import java.util.Vector;

public class VectorD {

	 public static void main(String[] args) {
	        Vector<String> v1 = new Vector<String>();
	          
	        v1.add("a");
	        v1.add("v");
	        v1.add("e");
	        v1.add("w");
	        v1.add("j");
	        
	        Collections.sort(v1);
	        
	        System.out.println("sorted vector : " + v1);
	    }


	
}
