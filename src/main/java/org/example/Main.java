package org.example;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");


        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));

        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));

        System.out.println(numberToWords(123));
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(-12));
    }


    public static boolean isPalindrome(int number) {

        int original = Math.abs(number);
        int reversed = 0;
        int temp = original;

        while (temp > 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        return original == reversed;
    }


    public static boolean isPerfectNumber(int number) {

        if (number < 0) {
            return false;
        }

        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum == number;
    }


    public static String numberToWords(int number) {

        if (number < 0) {
            return "Invalid Value";
        }

        String[] words = {
                "Zero","One","Two","Three","Four",
                "Five","Six","Seven","Eight","Nine"
        };

        String num = String.valueOf(number);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';
            result.append(words[digit]).append(" ");
        }

        return result.toString().trim();
    }

}
