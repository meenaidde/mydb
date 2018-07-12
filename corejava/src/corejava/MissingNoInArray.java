package corejava;

public class MissingNoInArray {
public static void main(String[] args) {
	int[] a={1,3,4,5,6};
	int no=getNo(a,5);
	System.out.println(no);
}
private static int getNo(int[] a, int n) {
	int total=((n+1)*(n+2))/2;
for(int i=0;i<n;i++){
	total=total-a[i];
	
}
	return total;
}
}
