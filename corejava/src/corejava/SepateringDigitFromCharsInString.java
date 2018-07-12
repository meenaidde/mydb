package corejava;

public class SepateringDigitFromCharsInString{
public static void main(String[] args) {
	
	  final String input = "0-123-abc-456-xyz-789";
	    final String result = stripNonDigits(input);
	    System.out.println(result);
	
	
	/*String s="abc123";
	String st="";
	String letter="";

	char ch[]=s.toCharArray();
	for(int i=0;i<ch.length;i++){
		
		if((ch[i]>='0')&&(ch[i]<='9')){
			st=st+ch[i];}
		else{
			letter=letter+ch[i];
		}
		}			System.out.println(st);
			System.out.println(letter);*/

		

	}

public static String stripNonDigits(
        final CharSequence input /* inspired by seh's comment */){
final StringBuilder sb = new StringBuilder(
        input.length() /* also inspired by seh's comment */);
for(int i = 0; i < input.length(); i++){
    final char c = input.charAt(i);
    if(c > 47 && c < 58){
        sb.append(c);
    }
}
return sb.toString();
}
	
}

/* public static void main(String[] args) {
String str = "hello123";
NumberAndLetter(str);
}

public static void NumberAndLetter(String str1) {
String number = "";
String letter = "";
for (int i = 0; i < str1.length(); i++) {
       char a = str1.charAt(i);
       if (Character.isDigit(a)) {
             number = number + a;

       } else {
             letter = letter + a;

       }
}
System.out.println("Alphates in string:"+letter);
System.out.println("Numbers in String:"+number);

}
}
*/

