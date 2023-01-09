package Array;

public class MultiDimenssion {
//  0 1 2
// 0 10 20 30
// 1 40 50 60	
public static void main(String[] args) {
	int ar [][]= {{10,20,30},{40,50,60},{12,23,34}};
	int a=ar.length;
	for (int i=0;i<=2;i++) {
		for(int j=0;j<=2;j++) {
			System.out.print(ar[i][j]+" ");
		}
		System.out.println();
	}
}

}
