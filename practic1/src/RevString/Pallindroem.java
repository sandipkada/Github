package RevString;

public class Pallindroem {

	public static void main(String[] args) {
		String a="121";
		String rev="";
		for(int i=a.length()-1;i>=0;i--) {
			rev=rev+a.charAt(i);
		}
		System.out.println(rev);
		System.out.println(rev);
	}
}
