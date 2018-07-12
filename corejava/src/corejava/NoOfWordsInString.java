package corejava;

public class NoOfWordsInString {
public static void main(String[] args) {
	String s="hi hello";
	char[] a=s.toCharArray();
	int count=1;
	for(int i=0;i<s.length()-1;i++){
			if(s.charAt(i)==' '){
				count++;
			}
}
	System.out.println(count);
}
}
