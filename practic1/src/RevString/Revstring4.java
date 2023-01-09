package RevString;

public class Revstring4 {
	public static void main(String[] args) {
String a="my Group is best group in class but little Lazy";
	String b="";
	for(int i=a.length()-1;i>=0;i--) {
		b=b+a.charAt(i);
	}
	System.out.println(b);
	System.out.println(b.indexOf("L"));
	
	}
}
