import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;


public class HashMap1 
{

	public static void main(String[] args) 
	{
		Map<String, String> m=new HashMap<>();
		m.put("Tea", "Cup");
		m.put("Chair", "Table");
		m.put("Bus", "Road");
		m.put("Animal", "Humans");
		
		//a
		Set<Entry<String, String>> s=m.entrySet();
		Iterator<Entry<String,String>> i=s.iterator();
		while(i.hasNext())
		{
			Map.Entry<String, String> me=i.next();
			if(me.getKey().equals("Chair"))
			{
				System.err.println("Chair is present");
				break;
				
			}
		}
		
		//b
		s=m.entrySet();
		i=s.iterator();
		
		while(i.hasNext())
		{
			Map.Entry<String, String> me=i.next();
			if(me.getValue().equals("Cup"))
			{
				System.out.println("Cup is present");
				break;
			}
		}
		
		//c
		s=m.entrySet();
		i=s.iterator();
		
		while(i.hasNext())
		{
			Map.Entry<String, String> me=i.next();
			System.out.println(me);
		}
		
	}

}
