import java.util.Scanner;

import util.MathUtil;

public class App {
    public static void main(String[] args) {
        System.out.println("Please input a binary number that is less than 32 bit: ");
        // 1. get the input from terminal
        Scanner sc = new Scanner(System.in);
        // 2. return decimal result
        int res = MathUtil.bin2Dec(sc.next());
        sc.close();
        // 3. print the result
        System.out.println(res == -1 ? "Cannot convert it." : res);
    }
}
