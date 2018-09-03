package seleniumtutorial;

public class variables {
	public static void main(String[] args) {
		/*
		 * byte Min: -128 Max: 127 Default: 0
		 */
		byte byteVariable = 100;
		System.out.println("byte value: " + byteVariable);
		/*
		 * short Min: -32768 Max: 32767 Default: 0
		 */
		short shortVariable = 1000;
		System.out.println("short value: " + shortVariable);
		/*
		 * int Min: -2147483648 Max: 2147483647 Default: 0
		 */
		int intVariable = 10000;
		System.out.println("int value: " + intVariable);
		/*
		 * long Min: -2^63 Max:2^63-1 default: 0
		 */
		long longVariable = 100000000L;
		System.out.println("long value: " + longVariable);

		/*
		 * float default: 0.0f
		 */
		float floatVariable = 2.34f;
		System.out.println("float value: " + floatVariable);
		/*
		 * double default: 0.0d
		 */
		double doubleVariable = 200.34d;
		System.out.println("double value: " + doubleVariable);
		/*
		 * boolean true or false, default:false
		 */
		boolean booleanVariable = true;
		System.out.println("boolean value: " + booleanVariable);
		/*
		 * char Min: 0, Mac: 65535
		 */
		char charVariable = 'b';
		System.out.println("char value: " + charVariable);
	}
}
