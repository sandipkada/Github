package RevString;

public class Pallindrom1 {
 public static void main(String[] args) {
	String a="DaD";
	String rev="";
	for(int i=a.length()-1;i>=0;i--) {
		rev=rev+a.charAt(i);
	}
	System.out.println(rev);
	if(a.equals(rev)) {
		System.out.println("string is pallindrom");
	}
	else {
		System.out.println("string is not pallindrom");
	}
}



}
