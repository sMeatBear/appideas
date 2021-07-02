import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import util.MathUtil;

public class App {
    public static void main(String[] args) throws IOException {
        System.out.println("Please input a binary number that is less than 31 bits: ");
        // 1. get the input from terminal
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 2. return decimal result
        int res = MathUtil.bin2Dec(br.readLine());
        br.close();
        // 3. print the result
        System.out.println(res == -1 ? "Cannot convert it." : res);
    }
}
