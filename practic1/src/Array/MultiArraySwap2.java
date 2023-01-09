package Array;

public class MultiArraySwap2 {

	public static void main(String[]args){

		  int a[]={20,30,10,46,56,76,67};
		  
		for(int i=0;i<=a.length-1;i++){
		  System.out.println(a[i]);}

		   for(int i=0;i<(a.length/2);i++){
		   int z;
		   z=a[i];
		    a[i]=a[(a.length-1)-i];
		    a[(a.length-1)-i]=z;
		 System.out.println();}
		   
		  for(int i=0;i<=a.length-1;i++){
		 System.out.print(a[i]+" ");}

		}

}
