package CodeUp;

import com.sun.org.apache.xpath.internal.operations.Equals;

public class test {
	public static void main(String[] args) {
		String str = "Hello World";

		int index = str.indexOf("Z"); // 없는것을 찾으면 -1
		System.out.println(index);

		index = str.indexOf("llo");
		System.out.println(index);

		boolean result = str.contains("Wo");
		System.out.println(result);

		String str2 = str.substring(1);
		System.out.println(str2);

		String str3 = str.substring(1, 5);
		System.out.println(str3);

		System.out.println(str.length());
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			System.out.println(c);
		}

		System.out.println(equals("hello", "helloo"));

	}

	static boolean equals(String s1, String s2) {
		int sum = 0;
		if (s1.length() == s2.length()) {
			for (int i = 0; i < s1.length(); i++) {
				if (s1.charAt(i) == s2.charAt(i))
					sum++;
			}
		}
		if (sum == s1.length())
			return true;
		else
			return false;
	}
}