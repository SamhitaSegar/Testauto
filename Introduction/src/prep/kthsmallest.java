package prep;

import java.util.PriorityQueue;

public class kthsmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={7, 10, 4, 3, 20, 15};
		int k=3;
		PriorityQueue<Integer> q=new PriorityQueue<Integer>();		
		for (int i = 0; i < a.length; i++) 
            q.add(a[i]); 
          
            int count = 0, ans = 1; 
  
            // One by one extract items 
            while(q.isEmpty() == false && count < k) 
            { 
                ans =  q.element(); 
             //   System.out.println(ans);
                q.remove(); 
                count++; 
            } 
           // System.out.println(ans);

	}

}