package Array;

public class MultySwapping {

	public static void main(String[] args) {
		int a[]= {30,50,60,54,65,78,29};
		for(int i=0;i<=a.length-1;i++) {
			System.out.println(a[i]);
		}
		for(int i=0;i<(a.length/2);i++) {
			int z;//declare new variable
			z=a[i];
			a[i]=a[(a.length-1)-i];//a[6]
			a[(a.length-1)-i]=z;
		}
		System.out.println();
		//System.out.println(a[6]);
	System.out.println("-----swapping is done-------");
	for(int i=0;i<=a.length-1;i++) {
		System.out.print(a[i]+" ");
	}
	}
}
