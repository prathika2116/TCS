import java.util.*;
public class Main
{
	public static void main(String[] args) {
	 int[] arr={1,2,2,6};
	 int[] temp=arr;
	 Arrays.sort(arr);
	 HashMap<Integer,Integer> hs=new HashMap<>();
	 for(int i=0,j=1;i<arr.length;i++,j++)
	 {
	     hs.put(arr[i],hs.getOrDefault(arr[i],j));
	 }
	 for(int i=0;i<arr.length;i++)
	 {
	     System.out.println(hs.get(temp[i]));
	 }
	}
}
