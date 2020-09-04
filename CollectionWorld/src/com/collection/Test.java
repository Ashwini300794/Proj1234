package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

			List<String> mh= new ArrayList();
			mh.add("Pune");
			mh.add("Mumbai");
			
			List<String> ka=new ArrayList();
			ka.add("abc");
			ka.add("xyz");
		
		ashuuuu
			
			List <List<String>> india=new ArrayList();
			india.add(mh);
			india.add(ka);
			
			List<String> state1=new ArrayList();
			state1.add("city1");
			state1.add("city2");
			
			List<String> state2=new ArrayList();
			state2.add("city3");
			state2.add("city4");
			
			List<List<String>> usa=new ArrayList();
			usa.add(state1);
			usa.add(state2);
			
			List<List<List<String>>> world=new ArrayList();
			world.add(india);
			world.add(usa);
		
			Iterator<List<List<String>>> itr = world.iterator();
//			System.out.println("before while loop"+itr);
			while(itr.hasNext())
			{
//				System.out.println("Inside while loop");
				List <List<String>> ctr = itr.next();
				
				Iterator <List<String>> it = ctr.iterator();
				while(it.hasNext())
				{
					List <String> st = it.next();
					//System.out.println(st);
					
					Iterator<String> ci = st.iterator();
					while (ci.hasNext()) 
					{
						String c = ci.next();
						System.out.println(c);
						
					}
				}
				
				
				//String var = itr.next();
					//List<List<String>> countries=itr.next();
					//System.out.println(countries);
			}
	}
}
/*Iterator<List<String>> itr1=countries.iterator();
while(itr1.hasNext());
{
	
	List<String> states=itr1.next();
	System.out.println(states);

	Iterator <String> itr2=states.iterator();
while(itr2.hasNext())
{
String cities=itr2.next();
System.out.println(cities);

}
}

}
	}*/
	
