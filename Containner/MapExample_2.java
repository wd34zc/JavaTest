/*аЁР§зг*/
import java.util.*;
public class MapExample_2
{
	public static void main(String args[])
	{
		Map m = new HashMap();
		for(int i=0;i<args.length;i++)
		{
			Integer a = (Integer)m.get(args[i]);
			m.put(args[i],a==null?1:new Integer(a+1));
		}
		System.out.println(m);
	}
}