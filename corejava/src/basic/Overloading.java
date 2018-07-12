package basic;

public class Overloading {
	public static void main(String[] args) {
		m1(10);
		m1(new Integer(20));
}
public static void m1(int i) {


	System.out.println("m1 primitive"+i);
}
public static void m1(Integer i1){
	System.out.println("class variable"+i1);
}


}