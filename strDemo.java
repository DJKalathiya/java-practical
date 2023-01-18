import java.util.Scanner;
class strDemo{
	public static void main(String [] args){
		String str1 = new String("Test String");
		System.out.println("String1 = "+str1);
		String str2 = new String(str1);
		System.out.println("String2 = "+str2);
		String str3 = new String();
		System.out.println("string3 = " +str3);
		String str4 = "Another test string";
		System.out.println("String4 = "+str4);
		
		System.out.println("String length1 = " +str1.length());
		System.out.println("String length2 = " +str2.length());
		System.out.println("String length3 = " +str3.length());
		System.out.println("String length4 = " +str4.length());
		
		System.out.println("Charat 3 = " +str1.charAt(3));
		System.out.println("String index of 't' is = " + str1.indexOf('t'));
		System.out.println("String last index of t is = " + str1.lastIndexOf('t'));
		System.out.println("String1 substring from index 1 to lastchr = "+str1.substring(1,7));

	if(str1 == str2){
		System.out.println("Equal");
	}else{
		System.out.println("NOt Equal");
	}
	System.out.println(str1.equals(str2));
}
}