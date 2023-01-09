package RevString;

public class RevforString {
  
public static void main(String[] args) {
	String a="Velocity";
	int b=a.length();
	for(int i=b-1;i>=0;i--) {
		for(int j=0;j<=i;j++) {
			System.out.print(a.charAt(j));
		}
		System.out.println();
	}
}

	


}
