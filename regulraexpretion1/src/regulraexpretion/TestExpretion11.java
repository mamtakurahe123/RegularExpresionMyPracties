package regulraexpretion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestExpretion11 {
	public static void main(String[] args) {
		   
	    System.out.println(validate("abcdef"));
		System.out.println(validate("3abcdef"));
        System.out.println(validate("abcdef9"));
		System.out.println(validate("abcdef3459"));
        }

   public static String validate(String text) {
	    Pattern pattern = Pattern.compile(".*[0-9]$");
		Matcher m = pattern.matcher(text);
		
	    if (m.find())
            return "Found a match!";
        else
            return "Not matched!";
   }
}
