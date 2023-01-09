package Array;

import java.util.Arrays;

public class AscDscArray1 {

public static void main(String[] args) {
	int a[]= {30,60,10,40,90,20};
	for(int i=0;i<=a.length-1;i++) {
		System.out.println(a[i]);
	}
	System.out.println("---------Ascending order--------");
	Arrays.sort(a);
	for(int i=0;i<=a.length-1;i++) {
		System.out.println(a[i]);
	}
	System.out.println("---------Desending-----------");
	for(int i=a.length-1;i>=0;i--) {
		System.out.println(a[i]);
	}
	System.out.println();
}

}
