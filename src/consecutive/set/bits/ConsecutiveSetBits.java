package consecutive.set.bits;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsecutiveSetBits {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testCaseCount = Integer.parseInt(reader.readLine());
        while (testCaseCount-- > 0) {
            long number = Long.parseLong(reader.readLine());
            int ans = getMaxConsecutiveSetBits(number);
            System.out.println(ans);
        }
    }

    private static int getMaxConsecutiveSetBits(long number) {

        int maxCount = 0;
        int currCount = 0;
        for (int i = 0; i < 63; i++) {
            if (checkIsSetBit(number, i)) {
                currCount++;
            } else {
                if (currCount > maxCount) {
                    maxCount = currCount;
                    currCount = 0;
                }
            }
        }
        if (currCount > maxCount) {
            maxCount = currCount;
        }
        return maxCount;
    }

    private static boolean checkIsSetBit(long number, int index) {
        return ((number & (1L << index)) == (1L << index));
    }
}
