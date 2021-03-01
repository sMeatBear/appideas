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
        if (binArr.length > 31) {return -1;}
        // check if all the chars in it are digit
        for (char ch : binArr) {
            if (!Character.isDigit(ch)) {return -1;}
        }
        
        int res = 0;
        for (char d : binArr) {
            res <<= 1;
            res += Character.digit(d, 10);
        }

        return res;
    }
}
