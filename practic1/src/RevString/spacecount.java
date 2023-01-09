package RevString;

public class spacecount {


public static void main(String[] args) {
	String a="My Name Is Sandip I Have Completed My Graduation";
    int Count = 0;
for(int i=0;i<=a.length()-1;i++) {
	char b = a.charAt(i);
	if(b==' ') {
		Count++;
	}
	
}
System.out.println(Count);

}

}
