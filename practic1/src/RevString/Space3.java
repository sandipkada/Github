package RevString;

public class Space3 {

	public static void main(String[] args) {
		String a="group 14 is best but little lazy";
		int count = 0;
		for(int i=0;i<a.length()-1;i++) {
			char b = a.charAt(i);
			if (b==' ') {
				count++;
			}
		}
		System.out.println(count);
	}
}
