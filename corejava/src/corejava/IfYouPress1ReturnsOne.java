package corejava;

import java.util.Scanner;

public class IfYouPress1ReturnsOne {
	static String one[]={" ","one","two","three","four","five",
						"six","seven","eight","nine","ten"};
	static String two[]={" ","twenty","thirty"};
	static void numToWord(int n,String s) {
		if(n<20){
			System.out.println(one[n]+" ");
		}
		else{
			System.out.println(two[n/10]+" "+one[n%10]);
		}
		if(n!=0){
			System.out.println(s+" ");
		}
	}
	
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter a no");
	int no=s.nextInt();
	numToWord(no/10000000%100,"crore");
	numToWord(no/1000000%100,"lakh");
	numToWord(no/1000%100,"thousand");
	numToWord(no/100%10,"hundred");
	numToWord(no%10," ");




	
}
}
