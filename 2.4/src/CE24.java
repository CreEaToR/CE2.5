
public class CE24 {

	public static void main(String args[]){
		
		
		String word = "school";
		
		char a = word.charAt(0);
		
		System.out.println("Char at 0 "  + a);
		
		String b = word.concat(" OK");
		
		System.out.println("Concat: " + b);
		
		System.out.println(word.equals("school"));
		
		System.out.println(word.equalsIgnoreCase("School"));
		
		System.out.println(word.indexOf(word));
		
		System.out.println(word.lastIndexOf(word));
		
		System.out.println(word.toLowerCase());

		System.out.println(word.toUpperCase());
		
		System.out.println(word.replace(word,"Hi"));
		
		System.out.println(word.substring(0));
		
		System.out.println(word.substring(0,1));
		
		System.out.println(word.trim());
		
		
	}
	
	
}
