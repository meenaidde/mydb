package corejava;

public class CharecterCount {
public static void main(String[] args) {
	
String s="welcomeaajava";
char c[]=s.toCharArray();
int count=0;
for(int i=0;i<c.length;i++){
	if(c[i]=='a'){
		count++;
	}		

}System.out.println( " a accured "+count+" times");

}
}
