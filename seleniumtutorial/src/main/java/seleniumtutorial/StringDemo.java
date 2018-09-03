package seleniumtutorial;

public class StringDemo {

	public static void main(String[] args) {
		String str1 = "Test";
		System.out.println(str1);
		String str2 = new String("Test2");
		String str3 = "Test";
		String str4 = new String("Test2");
		String str5 = str2.concat(" changed");
		System.out.println(str2);
		System.out.println(str1);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
	}

}
