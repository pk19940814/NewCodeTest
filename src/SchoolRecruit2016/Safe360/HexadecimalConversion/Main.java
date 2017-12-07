package SchoolRecruit2016.Safe360.HexadecimalConversion;

import java.util.Scanner;

/**
 * @author Kom
 * @date 2017/12/7
 * @description a simple question for Lu Ziye
 */
public class Main {
    private final static char[] Hex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private final static int minHex = 1;
    private final static int maxHex = 16;

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int inputMod = in.nextInt();
            String inputValue = in.next();
            int outputMod = in.nextInt();
            System.out.println(convert(inputMod, inputValue, outputMod));
        }

    }

    private static String convert(int inputMod, String inputValue, int outputMod) throws Exception {

        checkMod(inputMod);
        checkMod(outputMod);
        checkInput(inputValue, inputMod);
        if (inputMod == outputMod) {
            return inputValue;
        } else {
            String outputValue = "";
            Long decimalBaseNum = 0L;
            if (inputMod == 10) {
                decimalBaseNum = Long.valueOf(inputValue);
            } else {
                for (int i = 0; i < inputValue.length(); i++) {
                    char c = inputValue.charAt(i);
                    decimalBaseNum += findIndex(c);
                    if (i != inputValue.length() - 1) {
                        decimalBaseNum *= inputMod;
                    }
                }

            }

            while (decimalBaseNum / outputMod > 0) {
                outputValue = Hex[Integer.valueOf(String.valueOf(decimalBaseNum % outputMod))] + outputValue;
                decimalBaseNum /= outputMod;
            }
            outputValue = Hex[Integer.valueOf(String.valueOf(decimalBaseNum))] + outputValue;

            return outputValue;
        }
    }

    private static void checkMod(int mod) throws Exception {
        if (mod < minHex || mod > maxHex) {
            throw new Exception("超过规定进制大小");
        }
    }

    private static void checkInput(String inputValue, int mod) throws Exception {
        if (inputValue == null || "".equals(inputValue)) {
            throw new Exception("输入的是什么");
        }
        for (int i = 0; i < inputValue.length(); i++) {

            char c = inputValue.charAt(i);
            int index = findIndex(c);
            if (index >= mod) {
                throw new Exception("输入的是什么");
            }
        }
    }

    private static int findIndex(char c) throws Exception {
        int index = 0;
        if (c >= '0' && c <= '9') {
            index = c - '0';
        } else {
            index = (c - 'A');
            if (index < 0 || index > 25) {
                throw new Exception("输入的是什么");
            }
            index += 10;
        }
        return index;
    }

    private static int power(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }
}
