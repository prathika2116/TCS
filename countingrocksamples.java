public class Main
{
	public static void main(String[] args) {
	int[] arr2={345, 604, 321, 433, 704, 470, 808, 718, 517, 811};
	int[][] arr1={{300, 380}, {400, 700}};
	int count1=0;
	for(int i=0;i<arr1.length;i++)
	{
	    int start=arr1[i][0],end=arr1[i][1];
	    for(int j=0;j<arr2.length;j++)
	    {
	        if(arr2[j]>start && arr2[j]<end)
	        count1++;
	    }
	    System.out.println(count1);
	    count1=0;
	}
	
	}
}
