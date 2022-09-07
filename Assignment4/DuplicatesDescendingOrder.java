package Assignment4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DuplicatesDescendingOrder {

	public static void main(String[] args) {
    List number=new ArrayList();
         number.add("Oriflame");
         number.add("Lakme");
         number.add("Nyka");
         number.add("Mamarth");
		 
		 System.out.println(number);
		 
		 Set al=new LinkedHashSet(number);
		 ArrayList removeDuplicates=new ArrayList(al);
		 
		 System.out.println(removeDuplicates);
        
		 Collections.sort(removeDuplicates,Collections.reverseOrder());
		 System.out.println(removeDuplicates);
	}

}
