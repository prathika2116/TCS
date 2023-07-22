public class Main
{
	public static void main(String[] args) {
	String m="Hello World";
    StringBuilder s=new StringBuilder(m);
    for(int i=0;i<s.length();i++)
    {
        if(Character.isUpperCase(s.charAt(i)))
        {
            s.setCharAt(i,Character.toLowerCase(s.charAt(i)));
        }
        else{
            s.setCharAt(i,Character.toUpperCase(s.charAt(i)));
        }
    }
   System.out.println(s);
	}
}
