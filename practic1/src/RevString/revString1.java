package RevString;

public class revString1 {
 
	public static void main(String[] args) {
	String a="good Morning";
	String b="";
	for(int i= a.length()-1;i>=0;i--) {
		b= b+a.charAt(i);
	}
	System.out.println(b);
	System.out.println("***************");
	System.out.println(b.indexOf("M"));
}
}
