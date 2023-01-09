package Array;

import java.util.Arrays;

public class AscDscArray2 {
public static void main(String[] args) {
	int a[]= {90,67,100,10,47,67,75,38};
for(int i=0;i<=a.length-1;i++) {
	System.out.println(a[i]);
}
System.out.println("--------asending------");
Arrays.sort(a);
for(int i=0;i<=a.length-1;i++) {
	System.out.println(a[i]);
}
System.out.println("--------Desending--------");
for(int i=a.length-1;i>=0;i--) {
	System.out.println(a[i]);
}

}
	
}
