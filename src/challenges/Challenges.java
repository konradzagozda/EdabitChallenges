package challenges;

public class Challenges {
    // https://edabit.com/challenge/ocqRdAXXniLS4ea3h
    public static boolean checkEquality(Object a, Object b) {
        if (a == null && b == null) { return true;}
        if (a == null || b == null) { return false;}
        return a.equals(b);
    }

    // https://edabit.com/challenge/LJh54oryEc3tkagzD
    public static String correctSpacing(String sentence) {
        return sentence.trim().replaceAll("\\s+", " ");
    }

}
