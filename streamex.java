package java8;

import java.util.ArrayList;
import java.util.List;

public class streamex {
	public static void main(String [] args)
	{
		
	
List<String> names=new ArrayList<String>();
names.add("rishi");
names.add("sha");
names.add("tis");
int count=0;
for(String ele : names)
{if(ele.length()<6)
{count++;}}
	System.out.println("there are "+(count++)+" string with less than 6");
int number=(int) names.stream().filter(ele ->ele.length()<6).count();
System.out.println("there are "+number+" string with less than 6");
}
}
