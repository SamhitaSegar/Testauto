package Hackerrank;

import java.util.ArrayList;
import java.util.List;

public class choclatecount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> s= new ArrayList<Integer>();
		int d=3;
		int m=2;
		s.add(1);s.add(1);s.add(1);s.add(1);s.add(1);s.add(1);
		int count=0;
        for(int i=0;i<s.size();i++)
        {
        	int k=0;
        	int j=i;
        	int sum=0;
            while(k<m && j<s.size())
            {
            	k++;
              sum+=s.get(j);
              if(sum==d &&k==m)
              {
                  count++;
              }
              j++;
            }
        }
        System.out.println(count);

	}

}