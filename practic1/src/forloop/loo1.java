package forloop;

public class loo1 {

	public static void main(String[] args) {
		int star=1;
		for(int i=1;i<=5;i++) {
			for(int a=1;a<=star;a++) {
				System.out.print("*");
			}
			System.out.println();
			star++;
		}
	}
}
