import java.util.Properties;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Properties1 
{

	public static void main(String[] args) 
	{
		Properties p=new Properties();
		
		p.setProperty("West Bengal", "Kolkata");
		p.setProperty("Maharashtra", "Mumbai");
		p.setProperty("Rajasthan", "Jaipur");
		
		Set<Entry<Object, Object>> s=p.entrySet();
		Iterator<Entry<Object, Object>> i=s.iterator();
		
		while(i.hasNext())
		{
			Entry<Object, Object> e=i.next();
			System.out.println(e);
		}
		
	

	}

}
