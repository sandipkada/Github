package RevString;

public class Space {

public static void main(String[] args) {
	String s="Regrestion testing is easy in automation";
	   int Count = 0;
	   for(int i=0;i<=s.length()-1;i++) {
		   char s1 = s.charAt(i);
		   
		   if (s1==' ') {
			   Count++;
		   }
	   }
    
System.out.println(Count);

}

}
