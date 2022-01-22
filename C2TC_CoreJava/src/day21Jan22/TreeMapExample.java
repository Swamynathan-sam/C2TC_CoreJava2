package day21Jan22;
import java.util.*;  
class TreeMapExample
{  
	public static void main(String args[])
	{  
		TreeMap<Integer,String> map=new TreeMap<Integer,String>(); 
		map.put(100,"Amit");    
		map.put(102,"Ravi");    
		map.put(101,"Vijay");    
		map.put(103,"Rahul");    
		// map.put(null, "Xaviour"); //We can't have null as key in TreeMap
		map.put(105, null); //null value is allowed
		map.put(106, null);

		System.out.println("Lowest key is "+map.firstKey()); //fetches lowest key

		System.out.println("Highest key is "+map.lastKey());	//fetches highest key
		//removing entry based on key
		map.remove(101);
		/**Removing the entry based on Key and value
		 * returns true if key with which the specified value is associated
		 */ 
		System.out.println("Removing a value with wrong key: "+map.remove(102, "Amit"));
		System.out.println("Removing first entry "+map.pollFirstEntry());//It removes first entry in table
		System.out.println("Removing last entry "+map.pollLastEntry());//It removes last entry in table
		//get an entry
		System.out.println(map.getOrDefault(102,"Ravi" ));//it returns the value
		//replace an entry
		System.out.println("After replacing 103 "+map.replace(103, "Sam"));
		System.out.println(map);
		for(Map.Entry m:map.entrySet()){ 
			System.out.println(m.getKey()+" "+m.getValue());    
		}    
	}  
}
