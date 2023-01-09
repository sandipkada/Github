package RevString;

public class PallindroemString {

	public static void main(String[]args) {
		String a="madam";
		String rev="";
		for(int i=a.length()-1;i>=0;i--) {
		rev=rev+a.charAt(i);
		}
		System.out.println(rev);
		if(a.equals(rev)) {
			System.out.println("given string is pallindrom");
		}
		else {
			System.out.println("given string is not pallindron");
		}
			
	}

}
