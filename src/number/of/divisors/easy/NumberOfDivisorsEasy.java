package number.of.divisors.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class NumberOfDivisorsEasy {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testCaseCount = Integer.parseInt(reader.readLine());
        while (testCaseCount-- > 0) {
            int number = Integer.parseInt(reader.readLine());
            int numberOfDiv = getNumberOfDiv(number);

            System.out.println(numberOfDiv);
        }
    }

    private static int getNumberOfDiv(int number) {

        int count = 0;
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (i * i == number) {
                count += 1;
                break;
            } else if (number % i == 0) {
                count += 2;
            }
        }
        return count;
    }
}
