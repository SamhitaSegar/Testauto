package prepstring1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class allstringhavesamefreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="abbcaddee";
int[] a= new int[26];
Arrays.fill(a, 0);
for(int i=0;i<s.length();i++)
	a[s.charAt(i)-'a']++;
int first=0,pos=0;
for(int i=0;i<a.length;i++)
{
	if(a[i]!=0)
	{
		first=a[i];
		pos=i;
		break;
	}
}
int count=0,test=0;
for(int j=pos+1;j<a.length;j++)
{
	if(a[j]==first)
		count++;
	else if(a[j]!=first && a[j]!=0)
		test++;
		
}
if(test>1)
	System.out.println("Not one change");
else
	System.out.println("One Change");

	}

}