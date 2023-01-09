package forloop;

public class loop12 {

	public static void main(String[] args) { 
		 int space=1;
		 int star=5;
		 for(int i=1;i<=9;i++) {
			 for(int a=1;a<=star;a++) {
				 System.out.print("*");
			 }
			 for(int b=1;b<=space;b++) {
				 System.out.print(" ");
			 }
			 System.out.println();
			if(i<=4) {
				space++;
				star--;
			}
			else {
				space--;
				star++;
			}
				 
			
		 }
		 }
	

}
