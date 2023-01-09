package Array;

public class MultiArrayswapp1 {

	 public static void main(String[]args){
		  int a[]={10,20,30,40,50,60,70};
		for(int i=0;i<=a.length-1;i++){
		System.out.println(a[i]);
		}
		  for(int i=0;i<(a.length/2);i++){
		 int z; // new variable declare.

		  z=a[i];
		  a[i]=a[(a.length-1)-i];
		  a[(a.length-1)-i]=z;
		System.out.println();}
		  
		
		for(int i=0;i<=a.length-1;i++){
		System.out.print(a[i]+" ");  


		
		}
}



}
