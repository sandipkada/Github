package RevString;

public class String1 {
 public static void main(String[] args) {
	

	String a="Sandip kadam";
	String rev="";
	for(int i=a.length()-1;i>=0;i--) {
		rev=rev+a.charAt(i);
		
	}
	System.out.println(rev);
	System.out.println(rev.indexOf("S"));
 }
}
