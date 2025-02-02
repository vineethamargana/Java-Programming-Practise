
/*
 * MAP IS A COLLECTION OF KEY (KEY SET),VALUE (VALUES) PAIR 
 * KEY+VALUE IS CALLED AS ENTRY...ENTRIES
 * 
 * METHODS:
 * put(object key,object value)
 * putAll(map m)
 * remove(Object key)
 * clear()
 * size()
 * get(object key)
 * containsKey(Object Key)
 * containsValue(object Value)
 * keySet()
 * values()
 * entrySet()
 * isEmpty()
 * getKey()
 * getValue()
 */

package programsonMaps;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class ProgramonMap1 {
	public static void main(String args[])
	{
		//HashMap<String,Integer> map=new HashMap<String,Integer>();
		//LinkedHashMap<String,Integer> map=new LinkedHashMap<String,Integer>();
		TreeMap<String,Integer> map=new TreeMap<String,Integer>();
		map.put("india", 900);
		map.put("china", 800);
		map.put("usa", 700);
		map.put("uae", 600);
		map.put("japan",1900);
		map.put("italy",8900);
		map.put("india", 7900);
		map.put("china", 1800);
		//map.put(false,"pakistan");
		//map.put(false,null);
		/*Set<String> Countryname=map.keySet();
		System.out.println(Countryname);
		for(String k:Countryname)
		{
			Integer v=map.get(k);
			System.out.println(k+":"+v);
		}*/
		Set<Entry<String, Integer>> myentries=map.entrySet(); //not give {} this brackets it gives[]
		System.out.println(myentries);
		for(Entry<String, Integer> e:myentries)
		{
			//System.out.println(e);
			//System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
		
	}

}

/*
 1.* HashMap map=new HashMap();
		map.put("india", 900);
		map.put("china", 800);
		map.put("usa", 700);
		map.put("uae", 600);
		map.put("japan",1900);
		map.put("italy",8900);
		System.out.println(map);
  op:{usa=700, china=800, japan=1900, uae=600, india=900, italy=8900}
  
  2.HashMap map=new HashMap();
		map.put("india", 900);
		map.put("china", 800);
		map.put("usa", 700);
		map.put("uae", 600);
		map.put("japan",1900);
		map.put("italy",8900);
		map.put(false,"pakistan");
		map.put(false,null);
		System.out.println(map);
  op:{usa=700, china=800, japan=1900, false=null, uae=600, india=900, italy=8900}
  
  3.HashMap<String,Integer> map=new HashMap<String,Integer>();
		map.put("india", 900);
		map.put("china", 800);
		map.put("usa", 700);
		map.put("uae", 600);
		map.put("japan",1900);
		map.put("italy",8900);
		map.put("india", 7900);
		map.put("china", 1800);
		//map.put(false,"pakistan"); these are not allowed because the type is different.
		//map.put(false,null);
		System.out.println(map);
	op:{usa=700, china=1800, japan=1900, uae=600, india=7900, italy=8900}
4.using keySet
        map.put("india", 900);
		map.put("china", 800);
		map.put("usa", 700);
		map.put("uae", 600);
		map.put("japan",1900);
		map.put("italy",8900);
		map.put("india", 7900);
		map.put("china", 1800);
		//map.put(false,"pakistan");
		//map.put(false,null);
		Set<String> Countryname=map.keySet();
		System.out.println(Countryname);
		for(String k:Countryname)
		{
			System.out.println(k);
		}
op:[usa, china, japan, uae, india, italy]
usa
china
japan
uae
india
italy

5.using get() 
HashMap<String,Integer> map=new HashMap<String,Integer>();
		map.put("india", 900);
		map.put("china", 800);
		map.put("usa", 700);
		map.put("uae", 600);
		map.put("japan",1900);
		map.put("italy",8900);
		map.put("india", 7900);
		map.put("china", 1800);
		//map.put(false,"pakistan");
		//map.put(false,null);
		Set<String> Countryname=map.keySet();
		System.out.println(Countryname);
		for(String k:Countryname)
		{
			Integer v=map.get(k);
			System.out.println(k+":"+v);
		}
op:[usa, china, japan, uae, india, italy]
usa:700
china:1800
japan:1900
uae:600
india:7900
italy:8900


		
 */
