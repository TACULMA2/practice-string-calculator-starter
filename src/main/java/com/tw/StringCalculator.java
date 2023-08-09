package com.tw;

import java.util.regex.Pattern;

public class StringCalculator {
    public int add(String string) {
        if (string.isEmpty()) {
            return 0;
        }

        String uniqueCharacter = ",";
        String numbersSegment = string;

        if (string.startsWith("//")) {
            String[] index = string.split("\n", 2);
            uniqueCharacter = index[0].substring(2);
            numbersSegment = index[1];
        }

        String[] numbers = numbersSegment.split("[,\n" + Pattern.quote(uniqueCharacter) + "]");
        int sum = 0;

        for (String number : numbers) {
            if (!number.isEmpty()) {
                sum += Integer.parseInt(number);
            }
        }
        return sum;
    }
}