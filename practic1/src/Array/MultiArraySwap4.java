package Array;

public class MultiArraySwap4 {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60,70};
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
		System.out.println("----------swaping done-----");
		for(int i=0;i<=a.length-1;i++) {
			System.out.println(a[i]+" ");
		}
	}

}
