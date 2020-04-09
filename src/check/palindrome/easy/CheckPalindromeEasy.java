package check.palindrome.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckPalindromeEasy {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testCaseCount = Integer.parseInt(reader.readLine());
        while (testCaseCount-- > 0) {
            int stringLength = Integer.parseInt(reader.readLine());
            String inputString = reader.readLine();
            String isPalindrome = isPalindrome(inputString, stringLength) ? "Yes" : "No";
            System.out.println(isPalindrome);
        }
    }

    private static boolean isPalindrome(String inputString, int stringLength) {
        int p = 0, q = stringLength - 1;

        while (p < q) {
            if (inputString.charAt(p) != inputString.charAt(q)) {
                return false;
            }
            p++;
            q--;
        }

        return true;
    }
}
