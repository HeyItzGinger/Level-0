
public class StringMethods1 {
	public static void main(String[] args) {
		// 1. Create a String variable and initialize it to whatever you want
		String julia = "Julia";
		// 2. Print the 3rd char of your String to the console.
		//    HINT: .charAt
		System.out.println(julia.charAt(2));
		// 3. Print the length of your String to the console.
		//    HINT: .length
		System.out.println(julia.length());
		// 4. Using a for loop, print one char at time to the console.
		//    HINT: use .length() to determine how many loops
		for(int j = 0; j < julia.length(); j++){
			System.out.println(julia.charAt(j));
		}
		
		// 5. Pick a char inside your String, and use a loop to determine
		//    what position/index in the String the char is located.
		//    Print the char's position to the console.
		//    EXAMPLE: if your string is "abc" and you are searching 
		//             for char 'b', then print "b is at index 1"
		
		for(int j = 0; j < julia.length(); j++){
			if(julia.charAt(j) == 'i'){
			System.out.println(j);
			}
		}
		
	}
}


