package regulraexpretion;

public class TestExpretion14 {
	
	public static void main(String[] args) {	   
	    String text = "C++";
		System.out.println("Original string: "+text);
		System.out.println("New string: "+validate(text));
		text = "Java";
		System.out.println("\nOriginal string: "+text);
		System.out.println("New string: "+validate(text));
		text = "MID-CENTRALIZED";
		System.out.println("\nOriginal string: "+text);
		System.out.println("New string: "+validate(text));
		text = "LOWERED";
		System.out.println("\nOriginal string: "+text);
		System.out.println("New string: "+validate(text));
        }

   public static int validate(String text) {
	   return text.replaceAll("[^aeiouAEIOU]", "").length();
   }

}
