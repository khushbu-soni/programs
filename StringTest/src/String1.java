import java.util.Scanner;

/*
 * Convert String pattern aaabbbccd to a3b3c2d1
 * 
 * */
public class String1 {
	public static void main(String[] args) {
		String s = null;
		
		Scanner string = new Scanner(System.in);
		System.out.println("Enter String:::");
		if (string.hasNext()) {
			s = string.next();
			char[] charArray = s.toCharArray();
			String result = "";
			int occurance = 1;
			for (int i = 0; i < charArray.length; i++) {
				if (i == charArray.length - 1)
					result = result + charArray[i] + occurance;
				else {
					if (charArray[i] == charArray[i + 1])
						occurance++;
					else {
						result = result + charArray[i] + occurance;
						occurance = 1;
					}
				}
			}
			System.out.println("Result " + result);
			string.close();
		}
	}
}
