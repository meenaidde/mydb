package corejava;

import java.util.Arrays;

public class String_Alphabetical_Order {
	public static void main(String[] args) {
		String s="mkeenah hbdf";
		String[] sp=s.split(" ");
		int count=0;
		Arrays.sort(sp);
		for(String s1:sp){
			System.out.println(s1+" ");
			count++;
		}
		System.out.println();
		System.out.println(count);
		
	}
}
