package RevString;

public class StringMethod {

	public static void main(String[] args) {
		String a="velocity";
		String b="velocity";
		 
		String c=new String("velocity");
		String d=new String("velocity");
		
		System.out.println(a==b);//true
		System.out.println(c==d);//false
		 System.out.println(a==c);
		 System.out.println(a==d);
		 
		 System.out.println("-------------------");
		 
		 b="man";
		 System.out.println(b);
		 System.out.println(a);
		  System.out.println(a==b);//false
		 
	}
}
