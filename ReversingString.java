//implimenting a reversed string
package apjfsa;
//import package for reading from consol
import java.util.*;
//class-declaration
public class ReversingString {
    //main-function
	public static void main(String[] args) {
		System.out.println("Enter Full-Your Name :");
		//reading from consol
		Scanner sc=new Scanner(System.in);
		String originalString=sc.next();
		//creating object for String
        StringBuilder reversedStringBuilder=new StringBuilder(originalString).reverse();
        String reversedString=reversedStringBuilder.toString();
        //printing original string
        System.out.println("Original-String :"+originalString);
        //printing reversed string
        System.out.println("Reversed-String :"+reversedString);
	}

}
