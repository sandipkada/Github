package RevString;

public class RevString3 {


public static void main(String[]args) {
	String a="Velocity is good plateform for grow our skills";
	String rev="";
	for(int i=a.length()-1;i>=0;i--) {
		rev=rev+a.charAt(i);
	}
	System.out.println(rev);
	System.out.println(rev.indexOf("i"));
}
}
