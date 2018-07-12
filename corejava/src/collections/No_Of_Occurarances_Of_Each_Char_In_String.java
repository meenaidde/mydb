package collections;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class No_Of_Occurarances_Of_Each_Char_In_String {
public static void main(String[] args) {
	Map<Character,Integer> hm=new HashMap();
	String name="meenakshi";
	char[] ch=name.toCharArray();
	for(char c:ch){
		if(hm.containsKey(ch))
		hm.put(c, hm.get(c)+1);
	else{
		hm.put(c, 1);
	}	
		System.out.println(hm);}
Set<Entry<Character,Integer>> set=hm.entrySet();
Iterator <Entry<Character,Integer>> it=set.iterator();
while(it.hasNext()){
Map.Entry<Character,Integer> m1=(Map.Entry<Character,Integer>)it.next();
System.out.println(m1);
}

}
}
