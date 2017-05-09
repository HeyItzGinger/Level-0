public class StringMethods2 {
	public static void main(String[] args) {
		// 1. Create a String variable and initialize it with
		//    random upper and lower case characters.
		String Weird = "HeLLooO";
		// 2. Print your String to the console in upper case.
		String W = Weird.toUpperCase();
		System.out.println(Weird);
		// 3. Print your String to the console in lower case.
		W = Weird.toLowerCase();
		System.out.println(Weird);
		// 4. Print the first 3 char's of your String
		//    HINT: .substring(start,end)
		W = Weird.substring(0, 3);
		System.out.println(Weird);
		// 5. Print a single char somewhere in the middle of your String
		//    REMINDER: char's in string start at index 0
		W = Weird.substring(2,3);
		System.out.println(W);
		// 6. BONUS -- print the LAST 3 char's of your string using
		//        .length() to determine WHERE the last 3 char's are located.
		Weird = Weird.substring(Weird.length()-3,Weird.length());
		System.out.println(Weird);
	}
}

