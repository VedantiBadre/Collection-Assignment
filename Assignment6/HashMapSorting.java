package Assignment6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class HashMapSorting {

	public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        HashMap<String, Integer> hm = new HashMap<>();
        
        hm.put("Amravati", 6656234);
        hm.put("Nagpur", 893765);
        hm.put("Pune", 876455);
        hm.put("Mumbai", 123444);
        hm.put("Delhi", 652272);
        
        TreeMap<String, Integer> tm = new TreeMap<>(hm);
        tm.putAll(hm);
        
        Iterator itr=tm.keySet().iterator();               
        while(itr.hasNext())    
        {    
        String key=(String)itr.next();  
        System.out.println("Roll no:  "+key+"     name:   "+hm.get(key));
    
    }



}
}
