package Assignment3;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		 List number=Arrays.asList(1,2,2,1,6,4,6,4);
		 
		 System.out.println(number);
		 
		 Set al=new LinkedHashSet(number);
		 ArrayList removeDuplicates=new ArrayList(al);
		 
		 System.out.println(removeDuplicates);
        
		 Collections.sort(removeDuplicates);
		 System.out.println(removeDuplicates);
		 
	}

}
