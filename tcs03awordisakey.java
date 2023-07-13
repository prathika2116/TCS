import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    ArrayList<String> hs=new ArrayList<>();
	    String s=sc.next();
	    hs.add("break");
	    hs.add("case");
	    hs.add("continue");
	    hs.add("default");
	    hs.add("defer");
	    hs.add("else");
	    hs.add("for");
	    hs.add("func");
	    hs.add("goto");
	    hs.add("if");
	    hs.add("map");
	    hs.add("range");
	    hs.add("return");
	    hs.add("struct");
	    hs.add("type");
	    hs.add("var");
	    if(hs.contains(s))
	    System.out.println(s+"is a keyword");
	    else
	    System.out.println("it is not a keyword");
	}
}
