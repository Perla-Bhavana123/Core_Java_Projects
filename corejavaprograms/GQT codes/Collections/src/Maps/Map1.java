package Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.NavigableSet;
import java.util.TreeMap;
import java.util.function.BiFunction;

public class Map1 {

	private static final BiFunction<? super String, ? super String, ? extends String> String = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//--------------------hash set maps-----------------------------	
      HashMap<Integer, String> hm = new HashMap<Integer, String>();
      hm.put(5, "Bhavana");
      hm.put(3, "sai");
      hm.put(1, "noshi");
      hm.put(2, "ramya");
      hm.put(4, "neeha");
      System.out.println(hm);
      
      HashMap<String, String> hm2= new HashMap<String, String>();
      hm2.put("Bhavana", "bhavana");
      hm2.put("sai", "sai");
      hm2.put("noshi", "noshi");
      hm2.put("ramya", "ramya");
      hm2.put("neeha", "neeha");
      hm2.put("Bindu", "Bindu");
      System.out.println(hm2);
      
      //--------------------linked hash set maps----------------
      
      LinkedHashMap<Integer, String> lh = new LinkedHashMap<Integer, String>();
      lh.put(5, "Bhavana");
      lh.put(3, "sai");
      lh.put(1, "noshi");
      lh.put(2, "ramya");
      lh.put(4, "neeha");
      lh.put(1, "noshi");
      System.out.println(lh);
      
      LinkedHashMap<Integer, Integer> lh2 = new LinkedHashMap<Integer, Integer>();
      lh2.put(10, 10);
      lh2.put(20, 10);
      lh2.put(30, 10);
      lh2.put(10, 30);
      lh2.put(10, 40);
      System.out.println(lh2);
      
      TreeMap<Integer,String> t = new TreeMap<Integer, String>();
      t.put(1, "bhavana");
      t.put(2, "sai");
      t.put(3, "ram");
      Entry<Integer, String> p=t.pollFirstEntry();
      System.out.println(p);
    Entry<Integer, String> p1= t.pollLastEntry();
     System.out.println(p1);
     
     
     NavigableSet<Integer> d=t.descendingKeySet();
     System.out.println(d);
    
    lh.replace(3, "Poornima");
    System.out.println(lh);
    
  
    
	}

}
