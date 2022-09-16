import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        // Write your code here.
        ArrayList<Integer>res=new ArrayList<>();
        for(int i=arr.size()-1;i>m;i--)
        {
            res.add(arr.get(i));
        }
        int j=0;
        for(int i=m+1;i<arr.size();i++)
        {
           arr.set(i,res.get(j));
            j++;
        }
    }
}
