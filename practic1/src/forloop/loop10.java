package forloop;

public class loop10 {

	public static void main(String[]args) {
		int space=5;
		int star=5;
		for(int i=1;i<=4;i++) {
			for(int a=1;a<=space;a++) {
				System.out.print(" ");
			}
			for(int b=1; b<=star;b++) {
				System.out.print("*");
			}
			System.out.println();
			space--;
		}
	}
}
