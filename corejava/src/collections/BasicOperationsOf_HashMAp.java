package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class BasicOperationsOf_HashMAp {
public static void main(String[] args) {
	Map m=new HashMap();
	m.put("1", "one");
	m.put("2","two");
	System.out.println(m.get("2"));
	System.out.println(m.containsKey("1"));
	System.out.println(m.containsKey("3"));
	System.out.println(m.containsValue("three"));
	System.out.println(m.containsValue("one"));
Set<String> s=m.keySet();
for(String st:s){
	System.out.println("keys are "+st+"  "+m.get(st));
	
}
Set <Entry<String,String>>set=m.entrySet();
for(Entry<String,String> en:set){
	System.out.println("keys= "+en.getKey()+"values = "+en.getValue());
}
}
}
