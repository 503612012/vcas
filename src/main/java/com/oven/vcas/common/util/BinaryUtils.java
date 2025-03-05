package com.oven.vcas.common.util;

/**
 * 进制转换工具类
 *
 * @author Oven
 */
public class BinaryUtils {

    public static String unicodeStrToBinaryStr(String str) {
        StringBuilder result = new StringBuilder();
        char[] arr = str.toCharArray();
        for (char c : arr) {
            StringBuilder binary = new StringBuilder(strToBinaryStr(String.valueOf(c)));
            int length = binary.length();
            for (int i = 0; i < 32 - length; i++) {
                binary.insert(0, "0");
            }
            result.append(binary);
        }
        return result.toString();
    }

    /**
     * 将字符串转换成二进制字符串，以空格相隔
     */
    private static String strToBinaryStr(String str) {
        char[] strChar = str.toCharArray();
        StringBuilder result = new StringBuilder();
        for (char c : strChar) {
            result.append(Integer.toBinaryString(c));
        }
        return result.toString();
    }

    /**
     * 二进制转十进制
     */
    public static int binary2Decimal(String number) {
        return scale2Decimal(number, 2);
    }

    /**
     * 其他进制转十进制
     */
    public static int scale2Decimal(String number, int scale) {
        if (2 > scale || scale > 32) {
            throw new IllegalArgumentException("scale is not in range");
        }
        // 不同其他进制转十进制,修改这里即可
        int total = 0;
        String[] ch = number.split("");
        int chLength = ch.length;
        for (int i = 0; i < chLength; i++) {
            total += Integer.parseInt(ch[i]) * Math.pow(scale, chLength - 1 - i);
        }
        return total;
    }

}
