package util;

public class MathUtil {
    /**
     * Convert a given binary string to decimal string (the length is less than 31).
     * @param binStr the binary string needed to be converted
     * @return int number
     */
    public static int bin2Dec(String binStr) {
        // sanity check
        char[] binArr = binStr.toCharArray();
        // do not accept the binary number whose length is larger than 31
        // ** we must guarantee that the binary number is positive in integer type
        if (binArr.length > 31) {return -1;}
        // check if all the chars are digit and convert digit by digit 
        int ans = 0;
        for (char d : binArr) {
            if (!Character.isDigit(d) || d > '1') {
                return -1;
            }
            ans <<= 1;
            ans += d - '0';
        }

        return ans;
    }
}
