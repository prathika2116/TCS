public class Main
{
	public static void main(String[] args) {
	StringBuilder s=new StringBuilder("");
	int n=16;
	while(n!=0){
	    s.append(n%8);
	    n=n/8;
	}
	System.out.println(s.reverse());
	}
}
