package challenges;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Challenges {
    // https://edabit.com/challenge/ocqRdAXXniLS4ea3h
    public static boolean checkEquality(Object a, Object b) {
        if (a == null && b == null) {
            return true;
        }
        if (a == null || b == null) {
            return false;
        }
        return a.equals(b);
    }

    // https://edabit.com/challenge/LJh54oryEc3tkagzD
    public static String correctSpacing(String sentence) {
        return sentence.trim().replaceAll("\\s+", " ");
    }

    // https://edabit.com/challenge/mvHZK6Dy3ZF8EFoG3
    public static int mean(int a) {
        int digits = 0;
        int sum = 0;
        while (a > 0) {
            sum += a % 10;
            digits++;
            a /= 10;
        }
        if (digits == 0) return 0;
        return sum / digits;
    }


    // https://edabit.com/challenge/s8RHRY9hfmvYMuaeC
    public static int[] hashPlusCount(String s) {
        int[] out = {0,0}; // hash, plus
        for(int i = 0 ; i<s.length(); i++){
            if(s.charAt(i) == '#'){
                out[0]++;
            } else if(s.charAt(i) == '+'){
                out[1]++;
            }
        }
        return out;
    }

    // https://edabit.com/challenge/zr7BBJbeYikNBN2hf
    public static String societyName(String[] friends) {
        Stream<String> stream = Arrays.stream(friends);
        return stream.map(x -> x.substring(0,1)).sorted().collect(Collectors.joining());
    }

    // https://edabit.com/challenge/YNQQynxnFeoKNiqTM
    public static String removeSpecialCharacters(String s) {
        return s.replaceAll("[^\\w\\s- ]","");
    }


    // https://edabit.com/challenge/bL2E8p5DGWSNmEtAE
    public static boolean validatePIN(String s) {
        return s.matches("(\\d{6})|(\\d{4})");
    }

    // https://edabit.com/challenge/D7PZ7rcKGRiCvcm7C
    public static boolean canAlternate(String str) {
        int zeros = 0;
        int ones = 0;
        for (int i = 0; i<str.length() ; i++){
            if(str.charAt(i) == '1'){
                ones++;
            } else if(str.charAt(i) == '0'){
                zeros++;
            }
        }
        if (zeros == 0 || ones == 0) {
            return false;
        }
        if ((int)Math.abs(zeros - ones) <= 1) {
            return true;
        }
        return false;
    }

    // https://edabit.com/challenge/ePj2zup56kZrRbhDX
    public static boolean isPrime(int num) {
        if (num == 1){
            return false;
        }
        for (int i = 2 ; i<num; i++){
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // https://edabit.com/challenge/Jr7ueGQMEthBFYpB6
    public static boolean largestSwap(int num) {
        int digit1 = num % 10;
        int digit2 = num / 10 % 10;
        if (digit1 == digit2) {
            return true;
        }
        return digit1 < digit2;
    }


    // https://edabit.com/challenge/EiGazR6eGXHMx3hTy
    public static String stripSentence(String str, String chars) {

        for (int i = 0; i < chars.length(); i++) {
            String pattern = String.valueOf(chars.charAt(i));
            if (pattern.equals("?")){
                pattern = "\\?";
            }
            str = str.replaceAll(pattern, "");
        }
        return str;
    }

    // https://edabit.com/challenge/H5Tabm7omS9ia8Rce
    public static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n-1) + fib(n-2);
    }


    // https://edabit.com/challenge/FQPo8iZ8vuPEj2dKB
    public static int halveCount(int a, int b) {
        double a2 = (double) a;
        int howMany = 0;
        while (a2 > b){
            a2 /= 2;
            howMany++;
        }
        return howMany -1;
    }

}
