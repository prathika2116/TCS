import java.util.*;
public class Main
{
	public static void main(String[] args) {
    int[] a = {1, 3, 4, 2, 6, 5, 8, 7};
    Arrays.sort(a);
    int sum=0;
    for(int i=0;i<a.length;i++)
    {
	sum+=a[i];
	}
	System.out.println("Mean="+(float)sum/a.length);
	int mid=a.length/2;
	float median=0;
	if(a.length%2==0)
	{
	    median=(float)(a[mid]+a[mid-1])/2;
	}
	else{
	    median=a[mid];
	}
	System.out.println("Median="+median);
}
}
