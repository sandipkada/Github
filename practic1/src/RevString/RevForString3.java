package RevString;

public class RevForString3 {

   public static void main(String[] args) {
	String a="Welcome";
	int b=a.length();
	for(int i=0;i<=b-1;i++) {
		for(int j=0;j<=i;j++) {
			System.out.print(a.charAt(j));
		}
		System.out.println();
	}
}
}
