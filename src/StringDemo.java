
public class StringDemo {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = new String("hello");
		String s3 = "world";
		
		if(s1==s2) { //== checks memory location
			System.out.println("Both are pointing at the same memory location");
		}else {
			System.out.println("Both are pointing to the different memory location");
		}
		
		System.out.println("-----------------------------------");
//		String s4 = s1.concat(s3);
//		System.out.println(s4);
		System.out.println("concat: " + s1.concat(s3));
		System.out.println("uppercase: " + s1.toUpperCase());
		System.out.println("lowercase: " + s1.toLowerCase());
		System.out.println("length: " + s1.length());
		System.out.println("indexOf: " + s1.indexOf('l'));
		System.out.println("lastIndexOf: " + s1.lastIndexOf('l'));
		System.out.println("substring: " + s1.substring(1));
		System.out.println("substring(beginning, last): " + s1.substring(1, 4));
//		s1 = s1 + s2;
//		System.out.println(s1);
	}

}
