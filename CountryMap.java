/*import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;


public class CaseStudy1
{

	public static void main(String[] args) 
	{		
			HashMap<String, String> M1 = new HashMap<>();
				
			M1.put("India", "Delhi");
			M1.put("Japan", "Tokyo");
			M1.put("France", "Paris");

		
		//a
		Set<Entry<String, String>> s=M1.entrySet();
		Iterator<Entry<String,String>> i=s.iterator();
		while(i.hasNext())
		{
			Map.Entry<String, String> me=i.next();
			if(me.getKey().equals("Riya"))
			{
				System.out.println("Riya's contact detail is present");
				break;
				
			}
		}
		
		//b
		s=contactList.entrySet();
		i=s.iterator();
		
		while(i.hasNext())
		{
			Map.Entry<String, Integer> me=i.next();
			if(me.getValue().equals(98765432))
			{
				System.out.println("Anil's contact number  is present");
				break;
			}
		}
		
		//c
		s=contactList.entrySet();
		i=s.iterator();
		
		while(i.hasNext())
		{
			Map.Entry<String, Integer> me=i.next();
			System.out.println(me);
		}
		
	}

}
*/

/*import java.util.HashMap;

public class CaseStudy1 {

	public static void main(String[] args) {
		HashMap<String, Integer> countryMap = new HashMap<>();
		

		countryMap.saveCountryCapital("India", "Delhi");
		countryMap.saveCountryCapital("Japan", "Tokyo");
		countryMap.saveCountryCapital("USA", "Washington, D.C.");
		
		System.out.println(countryMap.getCapital("India"));
		System.out.println(countryMap.getCountry("Tokyo"));
		System.out.println(countryMap.toArrayList());
		
		HashMap<String, String> M2 = countryMap.swapKyeValue();
		System.out.println(M2);
	}

}*/



/*import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountryMap {
	private HashMap<String, String> M1;
	
	public CountryMap() {
		M1 = new HashMap<String, String>();
	}
	
	public HashMap<String, String> saveCountryCapital(String CountryName, String capital) {
		M1.put(CountryName, capital);
		return M1;
	}
	
	public String getCapital(String CountryName) {
		return M1.get(CountryName);
	}
	
	public String getCountry(String capitalName) {
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			
			if (me.getValue().equals(capitalName))
				return me.getKey();
		}
		
		return null;
	}
	
	public HashMap<String, String> swapKyeValue() {
		HashMap<String, String> M2 = new HashMap<String, String>();
		
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			M2.put(me.getValue(), me.getKey());
		}
		
		return M2;
	}
	
	public ArrayList<String> toArrayList() {
		ArrayList<String> list = new ArrayList<>();
		
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			list.add(me.getKey());
		}
		
		return list;
	}
}*/

import java.util.HashMap; 
import java.util.Map;
import java.util.Map.Entry;

class Countrymap1
{
	HashMap<String, String> M1 = new HashMap<>();
	void saveCountryCapital(String countryname, String capital)
	{
		M1.put(countryname, capital);
	}
	void getCapital(String countryname)
	{
		String a;
		if (M1.containsKey(countryname))
		{ 
			a = M1.get(countryname);
			System.out.println("CAPITAL OF "+countryname+" IS: "+a);
		}
	}
	void getCountry(String capital)
	{
		String a;
		
		for(Entry<String, String> entry: M1.entrySet()) {
			
			
			if(entry.getValue() == capital) {
		        System.out.println("COUNTRY OF "+capital+" is : " +entry.getKey());
		        break;
		      }
			
		}
		
	}
	void show()
	{
		if (M1.isEmpty())
		{
			System.out.println("Map is empty"); 
		} 
		else 
		{ 
			System.out.println(M1); 
		} 
	}
}
public class CountryMap
{
	public static void main(String[] args) 
	{
		Countrymap1 c = new Countrymap1();
		c.saveCountryCapital("India", "Delhi");
		c.saveCountryCapital("Germany", "Berlin");
		c.saveCountryCapital("Japan", "Tokyo");
		c.saveCountryCapital("England", "London");
		
		c.getCapital("Japan");
		c.getCountry("Delhi");
		c.show();
	}
}
