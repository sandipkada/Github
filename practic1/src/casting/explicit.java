package casting;

public class explicit {

   public static void main(String[] args) {
	double a=150.50;//8 byte
	System.out.println(a);
	
	int b=(int)a;//4 byte
	System.out.println(b);
	
	byte c=(byte)b;
	System.out.println(c);
	
}

}
