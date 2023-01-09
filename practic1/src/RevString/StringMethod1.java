package RevString;

public class StringMethod1 {
 
	public static void main(String[] args) {
		String a="Automation ";
		String b="AUTOMATION";
		String c="city";
		String d="";
		String e="Automation";
		
	System.out.println(c.replace("i", "Api"));
	System.out.println(a.concat(c));//join the 2 string
	System.out.println(a.isEmpty());//string is empty then output is true
	System.out.println(a.substring(5));//accept after string
	System.out.println(a.substring(3, 6));// only accept middle 
	System.out.println(a.endsWith("n"));
	System.out.println(a.startsWith("A"));
	System.out.println(a.lastIndexOf("a"));
	System.out.println(a.indexOf("n"));
	System.out.println(a.charAt(6));
	System.out.println(a.contains("on"));
	System.out.println(a.equals(b));//case check .
	System.out.println(a.equalsIgnoreCase(b));//case ignore.
	System.out.println(a.length());
	System.out.println(a.toUpperCase());
	System.out.println(b.toLowerCase());
	System.out.println(a==e);
	
	}

}
