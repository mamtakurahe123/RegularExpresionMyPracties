package regulraexpretion;

public class TestExpretion3 {
	public static void main(String[] args) {
		   
	    System.out.println(validate("java_exercises"));
		System.out.println(validate("Java_exercises"));
		System.out.println(validate("java_Exercises"));		
		System.out.println(validate("Java_Exercises"));	
		
        }

	   public static String validate(String text) {
		   if (text.matches("^[a-z]+_[A-Z]+$"))
	                return "Found a match!";
	       else
	                return "Not matched!";
	   }

}