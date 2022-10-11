package facade;

public class BinOps {

    public static String sum(String a, String b) {
        int integerA = Integer.parseInt(a, 2);
        int integerB = Integer.parseInt(b, 2);
        int resultInDec = integerA + integerB;
        return Integer.toBinaryString(resultInDec);
    }

    public static String mult(String a, String b) {
        int integerA = Integer.parseInt(a, 2);
        int integerB = Integer.parseInt(b, 2);
        int resultInDec = integerA * integerB;
        return Integer.toBinaryString(resultInDec);
    }
}
