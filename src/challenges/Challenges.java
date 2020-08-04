package challenges;

public class Challenges {
    // https://edabit.com/challenge/ocqRdAXXniLS4ea3h
    public static boolean checkEquality(Object a, Object b) {
        if (a == null && b == null) { return true;}
        if (a == null || b == null) { return false;}
        return a.equals(b);
    }

}
