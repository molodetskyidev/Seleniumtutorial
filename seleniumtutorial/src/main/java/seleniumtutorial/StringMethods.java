package seleniumtutorial;

public class StringMethods {

	public static void main(String[] args) {
		String str1 = "This is the test string";
		String str2 = "This is the test string2";
		String str3 = "";
		String str4 = " Spaces here ";
		String str5 = "epplea";
		System.out.println(str1.length());
		System.out.println(str1.charAt(5));
		System.out.println(str1.concat(" to test string methods"));
		System.out.println(str1.contains("x"));
		System.out.println(str1.startsWith("This"));
		System.out.println(str1.endsWith("ing"));
		System.out.println(str1.equals(str2));
		System.out.println(str1.indexOf("i"));
		System.out.println(str1.indexOf("x"));
		System.out.println(str1.isEmpty());
		System.out.println(str3.isEmpty());
		System.out.println(str4.trim());
		System.out.println(str5.replace("e", "a"));
		System.out.println(str1.substring(5, 7));
		char[] newchar = str1.toCharArray();
		for (int i = 0; i < newchar.length; i++) {
			System.out.print(newchar[i]);
		}
		System.out.println();
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
	}

}
