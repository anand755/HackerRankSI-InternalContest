package even.split;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenSplit {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testCaseCount = Integer.parseInt(reader.readLine());
        while (testCaseCount-- > 0) {
            long number = Integer.parseInt(reader.readLine());
            String result = checkIsEvenSplit(number) ? "Yes" : "No";
            System.out.println(result);
        }
    }

    private static boolean checkIsEvenSplit(long number) {
        if (number == 2L) {
            return false;
        } else {
            return ((number - 2L) % 2 == 0);
        }
    }
}
