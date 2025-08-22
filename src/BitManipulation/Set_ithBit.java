package BitManipulation;

public class Set_ithBit {

    public static void main(String[] args) {
        int n = 13; // binary 1101
        int i = 1;

        System.out.println("Original : " + n + " (" + Integer.toBinaryString(n) + ")");
        System.out.println("After setting bit " + i + " : " + setBitShift(n, i)
                + " (" + Integer.toBinaryString(setBitShift(n, i)) + ")");
    }

    private static int setBitShift(int n, int i) {
        return n | (1 << i);
    }
}
