package prepstring1;

import java.util.HashSet;

public class uncomcom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1 = "aacdb",s2 = "gafd";
StringBuilder s= new StringBuilder();
HashSet<Character> m=new HashSet<Character>();
for(int i=0;i<s1.length();i++)
{
	m.add(s1.charAt(i));
}
for(int i=0;i<s2.length();i++)
{
	if(!m.contains(s2.charAt(i)))
		s.append(s2.charAt(i));
	
}
System.out.println(s.toString());
	}

}