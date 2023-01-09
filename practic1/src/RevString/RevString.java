package RevString;

public class RevString {

	public static void main(String[]args){ 
		   String a="GoodMorning";
		   String rev="";
		  for(int i=a.length()-1;i>=0;i--){
		     rev= rev+a.charAt(i);
		}
		System.out.println(rev);
		System.out.println(rev.indexOf("M"));

		}


		}



