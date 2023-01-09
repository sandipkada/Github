package Array;

import java.util.Arrays;

public class AscDscArray {
public static void main(String[] args) {
	int s[]= {10,70,60,30,20,98 };
	
	for(int i=0;i<=s.length-1;i++) {
		System.out.println(s[i]);
	}
	Arrays.sort(s);//methode for ascending 
	System.out.println("------Array all info Ascendind order----");
	for(int i=0;i<=s.length-1;i++) {
		System.out.println(s[i]);
	
	
	}
	System.out.println("------Desending---------");
	for(int i=s.length-1;i>=0;i--) {
		System.out.println(s[i]);
	}
	
}


	

}
