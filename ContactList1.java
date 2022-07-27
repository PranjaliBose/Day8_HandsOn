import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;


public class ContactList1
{

	public static void main(String[] args) 
	{		
			HashMap<String, Integer> contactList = new HashMap<>();
				
			contactList.put("Riya", 98310983);
			contactList.put("Priya", 87654539);
			contactList.put("Anil", 98765432);

		
		//a
		Set<Entry<String, Integer>> s=contactList.entrySet();
		Iterator<Entry<String,Integer>> i=s.iterator();
		while(i.hasNext())
		{
			Map.Entry<String, Integer> me=i.next();
			if(me.getKey().equals("Riya"))
			{
				System.err.println("Riya's contact detail is present");
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




