package challenges;

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

}
