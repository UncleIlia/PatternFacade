public class BinOps {
    public String sum(String a, String b) {
        int a1 = Integer.parseInt(a, 2);
        int b1 = Integer.parseInt(b, 2);
        int resultOfSum = a1 + b1;
        return Integer.toBinaryString(resultOfSum);
    }

    public String mult(String a, String b) {
        int a1 = Integer.parseInt(a, 2);
        int b1 = Integer.parseInt(b, 2);
        int resultOfMult = a1 * b1;
        return Integer.toBinaryString(resultOfMult);
    }
}
