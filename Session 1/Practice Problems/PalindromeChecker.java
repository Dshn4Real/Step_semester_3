import java.util.Scanner;

public class PalindromeChecker {

    static boolean approach1(String str) {
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        return str.equals(reverse);
    }

    static boolean approach2(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
    static boolean approach3(String str) {
        String reverse = new StringBuilder(str).reverse().toString();

        return str.equals(reverse);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Approach 1: " + approach1(str));
        System.out.println("Approach 2: " + approach2(str));
        System.out.println("Approach 3: " + approach3(str));

        sc.close();
    }
}