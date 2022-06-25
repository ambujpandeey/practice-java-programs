package practice.java;

public class PalindromeDemo {
	public static void main(String[] args) {

		int n = 151;
		int t, sum = 0;
		int temp = n;
		while (n > 0) {
			t = n % 10;
			sum = (sum * 10) + t; 
			n = n / 10;
		}
		if (temp == sum) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}
}

