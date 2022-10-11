package facade;

public class Main {
    public static void main(String[] args) {
        String a = "1101001";
        String b = "1000010";
        var sum = BinOps.sum(a, b);
        var mult = BinOps.mult(a, b);

        System.out.printf("Результат сложения %s и %s : %s\n", a, b, sum);
        System.out.printf("Результат умножения %s и %s : %s\n", a, b, mult);
    }
}
