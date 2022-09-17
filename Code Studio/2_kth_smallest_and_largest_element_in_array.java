import java.util.ArrayList;
import java.util.*;

public class Solution {
	public static ArrayList<Integer> kthSmallLarge(ArrayList<Integer> arr, int n, int k) {
        PriorityQueue<Integer>pq1=new PriorityQueue<>();
        for(int i=0;i<k;i++)
        {
            pq1.add(arr.get(i));
        }
        for(int i=k;i<arr.size();i++)
        {
            if(pq1.peek()<arr.get(i))
            {
                pq1.poll();
                pq1.add(arr.get(i));
            }
        }
        int a=pq1.peek();
        PriorityQueue<Integer>pq2=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<k;i++)
        {
            pq2.add(arr.get(i));
        }
        for(int i=k;i<arr.size();i++)
        {
            if(pq2.peek()>arr.get(i))
            {
                pq2.poll();
                pq2.add(arr.get(i));
            }
        }
        int b=pq2.peek();
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<2;i++)
        {
            res.add(b);
            res.add(a);
        }
        return res;
	}
}
