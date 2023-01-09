package RevString;

public class Pallindrom2 {


public static void main(String[] args) {
	String a="MOM";
	String rev="";
	for(int i=a.length()-1;i>=0;i--) {
		rev=rev+a.charAt(i);
	}
	System.out.println(rev);
	if(a.equals(rev)) {
		System.out.println("String is pallindrome");
	}
	else {
		System.out.println("String is not pallindrom");
	}
}

}
