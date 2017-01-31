public class DeMorganComparison {
    public static void main(String[] args) {
        boolean A, B, C, D;
        A = true;
        B = false;
        C = A|B;
        System.out.println ("A|B = " + C);

        D = !(!A & !B);
        System.out.println ("!(!A & !B) = " + D);

    }
}