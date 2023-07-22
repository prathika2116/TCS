import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String res="This is a test string";
		String[] k=res.split(" ");
		int max=-1;
		for(String y:k)
		{
		    max=Math.max(y.length(),max);
		}
		System.out.println(max);
	}
}
