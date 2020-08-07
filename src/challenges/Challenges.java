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


}
