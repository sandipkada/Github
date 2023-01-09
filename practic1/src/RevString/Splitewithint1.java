package RevString;

public class Splitewithint1 {

	public static void main(String[] args) {
		String a="86-05-19-68-67";
		String b[]=a.split("-");
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
	}

}
