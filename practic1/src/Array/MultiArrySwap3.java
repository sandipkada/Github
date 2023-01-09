package Array;

public class MultiArrySwap3 {


public static void main(String[]args) {
	int a[]= {10,26,46,57,68,34,82,58};
	for(int i=0;i<=a.length-1;i++) {
		System.out.println(a[i]);
	}
	for(int i=0;i<(a.length/2);i++) {
		int z;// declare new variable 
		z=a[i];
		a[i]=a[(a.length-1)-i];
		a[(a.length-1)-i]=z;
		System.out.println();
	}
	for(int i=0;i<=a.length-1;i++) {
		System.out.print(a[i]+" ");
	}
}

}
